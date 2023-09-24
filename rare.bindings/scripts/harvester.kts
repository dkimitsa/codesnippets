#!/usr/bin/env kotlinc -jvm-target 9 -script --
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import java.io.File
import java.io.InputStream
import java.io.PrintStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption
import javax.xml.parsers.DocumentBuilderFactory
import kotlin.concurrent.thread
import kotlin.system.exitProcess

/**
 * Script to automate steps required to bind libraries:
 * - deletes old header files
 * - deletes old java bindings
 * - fetches version information and updates maven pom.xml files
 * - automatically performs bindings

 * important: to be run in robovm-robopods folder
 *
 * @author dkimitsa
 */

// single point for logs
val log = Log()

// readme file (also used as lock)
val readmeFile: File = Path.of("README.md").toFile().also {
    it.requiresIsFile { "Failed to locate ${it.canonicalPath}" }
}

// robovm-bro-gen project expected next to robovm-robopods
val broGenScript: File = Path.of("../../robovm-bro-gen/bro-gen.rb").toFile().also {
    it.requiresCanExecute { "Failed to locate bro-gen script at ${it.canonicalPath}" }
    log.i("bro-gen found at ${it.canonicalPath}")
}

// Download root folder
val downloadFolder: File = Path.of(System.getProperty("user.home"), "Downloads").toFile().also {
    it.requiresIsDirectory { "Failed to locate Download directory ${it.canonicalPath}" }
}

// maps group to list of frameworks
val knownGroups = mutableMapOf<String, MutableList<String>>()

// list of known frameworks and ways to process it
val knownFrameworks = mutableMapOf<String, (String) -> Unit>(
    "YabbiAds" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("YabbiAds/YabbiAds.xcframework/ios-arm64/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "yabbiads/",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "yabbiads.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                1. go to https://mobileadx.ru/maven/pods/YabbiAds/ to pick recent version 
                2. download framework and unpack 
                3. expected location ${artifactLocation} 
            """.trimIndent()
        )
    },
    "iubenda" to { framework ->
        val artifact = "$framework.framework"
        val artifactLocation = downloadFolder.extend("iubenda.xcframework/ios-arm64_armv7/$artifact")
        processFramework(
            artifact = artifact,
            moduleFolder = "iubenda/",
            sourceHeadersDir = artifactLocation.headers,
            yaml = "iubenda.yaml",
            version = { artifactLocation.infoPlist.extractVersion() },
            instruction = """
                0. check latest version number at https://www.iubenda.com/en/help/19678-cs-for-mobile-developers-guide
                1. go to https://github.com/iubenda/cocoapods and find a cocoaspec for it 
                2. get link from cocoaspec 
                3. download framework and unpack 
                4. expected location ${downloadFolder.extend("iubenda.xcframework/ios-arm64_armv7/$artifact")} 
            """.trimIndent()
        )
    }
)

// parse arguments
var parallelBuild = false
var interactive = false
var downloadInstructions = false
var buildModifier = 0
val frameworkToProcess = mutableListOf<String>()
args.forEach { arg ->
    if (arg.startsWith("-")) {
        when  {
            arg == "-v" -> log.verbose = true
            arg == "-p" -> parallelBuild = true
            arg == "-i" -> interactive = true
            arg == "-d" -> {
                downloadInstructions = true; interactive = true
            }
            arg.startsWith("-b=") -> {
                buildModifier = arg.substringAfter('=').toInt()
            }
            arg == "-h" -> printHelpAndExit(0)
            arg == "--help" -> printHelpAndExit(0)
            else -> {
                println("Error: unknown argument $arg")
                printHelpAndExit(-1)
            }
        }
    } else {
        if (knownFrameworks.keys.contains(arg)) {
            frameworkToProcess.add(arg)
        } else knownGroups[arg]?.let {
            frameworkToProcess.addAll(it)
        } ?: run {
            println("Error: unknown framework or group $arg")
            printHelpAndExit(-1)
        }
    }
}

if (frameworkToProcess.isEmpty()) {
    if (downloadInstructions) {
        frameworkToProcess.addAll(knownFrameworks.keys)
    } else {
        println("Error: not specified framework to process !")
        printHelpAndExit(-1)
    }
}

if (interactive && parallelBuild) {
    println("Error: interactive can't be used with parallel build!")
    printHelpAndExit(-1)
}

frameworkToProcess.run { if (parallelBuild && size > 1) parallelStream() else stream() }
    .forEach { framework -> knownFrameworks[framework]?.invoke(framework) }

println("bye-bye")

fun printHelpAndExit(code: Int) {
    println("usage:")
    println("scripts/harvester.kts [--help] [-v] [-p] [framework1 framework2 ...]")
    println("   --help, -h : prints this help and exits")
    println("           -v : enables verbose output")
    println("           -p : enables parallel processing")
    println("           -i : interactive mode, will check for existing folder and wait for it")
    println("           -d : interactive mode, will print download instructions and wait for frameworks")
    println("   frameworkX : list of frameworks to process. if not specified all frameworks will be processed")
    println("Known frameworks:")
    knownFrameworks.keys.sorted().forEach { println("    $it") }
    println("Known groups:")
    knownGroups.keys.sorted().forEach { group ->
        println("    $group:")
        knownGroups[group]?.forEach { println("        $it") }
    }
    exitProcess(code)
}


fun processInternal(
    framework: String,
    versionProvider: () -> String,
    moduleFolder: String,
    sourceHeadersDir: File,
    destinationHeadersDir: File,
    javaFolder: File,
    yamlFile: File,
    pomFile: File,
    instruction: String?,
    interactiveValidateHeaderFolder: (framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean) -> Unit,
    headerFolderCleaner: (framework: String, destinationHeadersDir: File) -> Unit,
    headersCopier: (framework: String, sourceHeadersDir: File, destinationHeadersDir: File) -> Unit,
    javaFolderCleaner: (framework: String, destinationJavaDir: File) -> Unit,
    broGenExecutor: (framework: String, javaFolder: File, yamlFile: File) -> Unit,
    pomVersionStringUpdater: (framework: String, pomFile: File, version: String) -> Unit,
    readmeFileVersionUpdater: (framework: String, moduleFolder: String, version: String) -> Unit
) {
    if (interactive) {
        if (downloadInstructions) {
            // extract version from the pom file
            val version = getPomVersionString(framework, pomFile)
            println("$framework: current version $version")
        }
        interactiveValidateHeaderFolder(framework, sourceHeadersDir, instruction, downloadInstructions)
        if (downloadInstructions)
            return
    }

    val version = versionProvider()
    log.d("$framework: version $version")
    headerFolderCleaner(framework, destinationHeadersDir)
    headersCopier(framework, sourceHeadersDir, destinationHeadersDir)
    javaFolderCleaner(framework, javaFolder)
    broGenExecutor(framework, javaFolder, yamlFile)
    pomVersionStringUpdater(framework, pomFile, version)
    readmeFileVersionUpdater(framework, moduleFolder, version)
}


fun cleanUpHeaders(framework: String, destinationHeadersDir: File) {
    // remove destination headers folder
    if (destinationHeadersDir.exists()) {
        log.i("$framework:  Removing existing headers @${destinationHeadersDir.canonicalPath}")
        destinationHeadersDir.requiresDeleteRecursively()
    }
}

fun cleanUpJava(framework: String, destinationJavaDir: File) {
    // remove destination headers folder
    if (destinationJavaDir.exists()) {
        log.i("$framework:  Removing existing Java folder @${destinationJavaDir.canonicalPath}")
        destinationJavaDir.requiresDeleteRecursively()
    }
}

fun interactiveValidateHeaderFolder(framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean = true) {
    val text = instruction
        ?: "There is no instruction configured for $framework.\nPlease provide missing framework at path specified."
    while (!sourceHeadersDir.isDirectory) {
        println("\n\nMissing source header for $framework at location:\n${sourceHeadersDir.canonicalPath}")
        println("")
        println(text)
        if (optional) {
            println("\n\nEnter Y to retry, ENTER to skip")
            val line = readLine()?.uppercase()
            if (line != "Y")
                break
        } else {
            println("\n\nPress ENTER key once solved")
            readLine()
        }
    }
}

fun copyHeaders(framework: String, sourceHeadersDir: File, destinationHeadersDir: File) {
    copyHeaders(framework, sourceHeadersDir, destinationHeadersDir, false)
}

fun copyHeaders(framework: String, sourceHeadersDir: File, destinationHeadersDir: File, intoExisting: Boolean) {
    // check if source folder exists
    sourceHeadersDir.requiresIsDirectory { "Missing header folder for $framework at ${sourceHeadersDir.canonicalPath}" }

    // copy new headers
    destinationHeadersDir.requireMkdirs(skipIfExist = intoExisting)
    log.i("$framework:  Copy headers from ${sourceHeadersDir.canonicalPath}")
    log.i("$framework:                 to ${destinationHeadersDir.canonicalPath}")
    sourceHeadersDir.copyRecursively(destinationHeadersDir)
}


fun copyHeadersFiltered(
    framework: String,
    sourceHeadersDir: File,
    destinationHeadersDir: File,
    flatten: Boolean = false,
    filter: (Path) -> Boolean = { true }
) {
    // check if source folder exists
    sourceHeadersDir.requiresIsDirectory { "Missing header folder for $framework at ${sourceHeadersDir.canonicalPath}" }

    // copy new headers
    destinationHeadersDir.requireMkdirs()
    log.i("$framework:  Copy headers from ${sourceHeadersDir.canonicalPath}")
    log.i("$framework:                 to ${destinationHeadersDir.canonicalPath}")

    val sourcePath = sourceHeadersDir.toPath()
    val destinationPath = destinationHeadersDir.toPath()
    Files.walk(sourcePath).forEach { source ->
        if (filter(source)) {
            val dest = destinationPath.resolve(if (flatten) source.fileName else sourcePath.relativize(source))
            dest.toFile().requireMkdirs()
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING)
        }
    }
}


fun execBroGen(framework: String, javaFolder: File, yamlFile: File) {
    // check if yaml file exists
    yamlFile.requiresIsFile { "$framework is missing yaml-file ${yamlFile.canonicalPath}" }

    // generating binding
    val broGenCmd = "${broGenScript.canonicalPath} ${javaFolder.canonicalPath} ${yamlFile.canonicalPath}"
    log.i("$framework:  Invoking bro-gen with command: $broGenCmd")
    exec("$framework:    ", broGenCmd)
}

fun getPomVersionString(framework: String, pomFile: File): String? {
    pomFile.requiresIsFile { "$framework is missing pom.xml ${pomFile.canonicalPath}" }
    val artifactTitleWithVersion = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pomFile)
        .getElementByTagName("name")?.getTextValue()
        ?: error("Failed to get <name> from ${pomFile.canonicalPath}")
    return artifactTitleWithVersion.indexOf("iOS v").takeIf { it > 0 }
        ?.let { artifactTitleWithVersion.substring(it + 5).trim() }
        ?: error("'iOS v' is missing in artifact <name> in ${pomFile.canonicalPath}")
}

fun updatePomVersionString(framework: String, pomFile: File, version: String) {
    // updating version string in pom file
    pomFile.requiresIsFile { "$framework is missing pom.xml ${pomFile.canonicalPath}" }
    val dom = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(pomFile)
    val artifactOldVersion = dom.getElementByTagName("version")?.getTextValue()
        ?: error("Failed to get <version> from ${pomFile.canonicalPath}")

    // updating the version in module POM file
    val snapshotTitle = "${version}.${buildModifier}-SNAPSHOT"
    log.i("$framework:  Replacing <version> from: $artifactOldVersion")
    log.i("$framework:                      with: $snapshotTitle")
    println(artifactOldVersion)
    pomFile.readText()
        .replaceFirst(
            "<version>$artifactOldVersion</version>",
            "<version>$snapshotTitle</version>")
        .run { pomFile.writeText(this) }
}

fun updateReadmeFileVersionString(framework: String, moduleFolder: String, version: String) {
    // updating the version in README file
    synchronized(readmeFile) {
        var original: String? = null
        var replacement: String? = null
        var versionLineFound = false
        val readmeModuleName = moduleFolder.substringBefore('/')
        readmeFile.readLines().map { line ->
            if (!versionLineFound)
                versionLineFound = line.startsWith("## Version of AltPods")
            if (versionLineFound && replacement == null && line.startsWith("|")) {
                val cols = line.split("|").toMutableList()
                if (cols.size == 4 && cols[1].contains("($readmeModuleName/)")) {
                    cols[2] = " $version".padEnd(cols[2].length)
                    original = line
                    replacement = cols.joinToString("|")
                    replacement!!
                } else line
            } else line
        }.run {
            if (replacement == null || original == null)
                error("$framework version entry ($readmeModuleName/) is not found in ${readmeFile.canonicalPath}")
            log.i("$framework:  Replacing README.md version from: $original")
            log.i("$framework:                                to: $replacement")
            readmeFile.writeText(this.joinToString(System.lineSeparator()))
        }
    }
}

fun updateModuleReadmeFileVersionString(framework: String, moduleReadmeFile: File, moduleFolder: String, version: String) {
    // updating the version in README file
    synchronized(readmeFile) {
        var original: String? = null
        var replacement: String? = null
        val readmeModuleName = File(moduleFolder).name
        moduleReadmeFile.requiresIsFile { "$framework is missing ${moduleReadmeFile.canonicalPath}" }
        moduleReadmeFile.readLines().map { line ->
            if (replacement == null && line.startsWith("|")) {
                val cols = line.split("|").toMutableList()
                if (cols.size == 5 && cols[1].contains("($readmeModuleName/)")) {
                    cols[3] = " $version".padEnd(cols[3].length)
                    original = line
                    replacement = cols.joinToString("|")
                    replacement
                } else line
            } else line
        }.run {
            if (replacement == null || original == null)
                error("$framework version entry ($readmeModuleName/) is not found in ${moduleReadmeFile.canonicalPath}")
            log.i("$framework:  Replacing README.md version from: $original")
            log.i("$framework:                                to: $replacement")
            moduleReadmeFile.writeText(this.joinToString(System.lineSeparator()))
        }
    }
}

// common framework processing code
fun processFramework(
    artifact: String,
    moduleFolder: String,
    sourceHeadersDir: File,
    destinationHeadersDir: File? = null,
    yaml: String,
    version: () -> String,
    instruction: String? = null,
    interactiveValidateHeaderFolder: (framework: String, sourceHeadersDir: File, instruction: String?, optional: Boolean) -> Unit = ::interactiveValidateHeaderFolder,
    headerFolderCleaner: (framework: String, destinationHeadersDir: File) -> Unit = ::cleanUpHeaders,
    headersCopier: (framework: String, sourceHeadersDir: File, destinationHeadersDir: File) -> Unit = ::copyHeaders,
    broGenExecutor: (framework: String, javaFolder: File, yamlFile: File) -> Unit = ::execBroGen,
    javaFolderCleaner: (framework: String, destinationJavaDir: File) -> Unit = ::cleanUpJava,
    pomVersionStringUpdater: (framework: String, pomFile: File, version: String) -> Unit = ::updatePomVersionString,
    readmeFileVersionUpdater: (framework: String, moduleFolder: String, version: String) -> Unit = ::updateReadmeFileVersionString,
) {
    log.d("$artifact:  <<<< starting processing")

    // check if source folder exists
    val resolvedDestinationHeadersDir =
        destinationHeadersDir ?: Path.of(moduleFolder, "src", "main", "bro-gen", artifact, "Headers").toFile()
    val javaFolder = Path.of(moduleFolder, "src", "main", "java").toFile()
    val yamlFile = Path.of(moduleFolder, "src", "main", "bro-gen", yaml).toFile()
    val pomFile = Path.of(moduleFolder, "pom.xml").toFile()

    // default processing
    processInternal(
        artifact, version, moduleFolder, sourceHeadersDir, resolvedDestinationHeadersDir, javaFolder, yamlFile, pomFile,
        instruction = instruction,
        interactiveValidateHeaderFolder = interactiveValidateHeaderFolder,
        headerFolderCleaner = headerFolderCleaner,
        headersCopier = headersCopier,
        javaFolderCleaner = javaFolderCleaner,
        broGenExecutor = broGenExecutor,
        pomVersionStringUpdater = pomVersionStringUpdater,
        readmeFileVersionUpdater = readmeFileVersionUpdater
    )

    log.d("$artifact:  <<<< finished processing")
}

fun extractVersionFromPlist(infoPlist: File): String {
    return execAndGetString(
        arrayOf(
            "/usr/libexec/PlistBuddy",
            "-c",
            "Print :CFBundleShortVersionString",
            infoPlist.canonicalPath
        )
    )[0]
}

fun azureVersionFromReadme(readmeFile: File): String {
    return readmeFile.readLines().find { it.startsWith("github \"Azure/azure-notificationhubs-ios\" ~> ") }
        ?.substringAfter("~> ")
        ?: error("Version not found in ${readmeFile.canonicalPath}")
}

fun File.requiresCanExecute(msgProvider: () -> String) {
    if (!this.canExecute())
        throw IllegalStateException(msgProvider())
}

fun File.requiresIsDirectory(msgProvider: () -> String) {
    if (!this.isDirectory)
        throw IllegalStateException(msgProvider())
}

fun File.requiresIsFile(msgProvider: () -> String) {
    if (!this.isFile)
        throw IllegalStateException(msgProvider())
}

fun File.requiresDeleteRecursively() {
    if (!this.deleteRecursively())
        throw IllegalStateException("Failed to delete ${this.canonicalPath}")
}

fun File.requireMkdirs(skipIfExist: Boolean = false): File {
    if (this.exists() && this.isDirectory && skipIfExist)
        return this
    if (!this.mkdirs())
        throw IllegalStateException("Failed to mkdirs ${this.canonicalPath}")
    return this
}

val File.headers: File
    get() = File(this, "Headers")

val File.infoPlist: File
    get() = File(this, "Info.plist")

fun File.extractVersion(): String {
    return extractVersionFromPlist(this)
}

fun File.extend(path: String): File = File(this, path)
fun String.extend(path: String): File = File(this, path)

fun exec(prefix: String, command: String) {
    val p = Runtime.getRuntime().exec(command)
    thread { p.errorStream.pipeTo(System.err, prefix) }
    thread { p.inputStream.pipeTo(System.out, prefix) }
    p.waitFor().also { code ->
        if (code != 0)
            error("non zero exit code $code when executing $command")
    }
}

fun execAndGetString(command: Array<String>): List<String> {
    val p = Runtime.getRuntime().exec(command)
    return p.inputStream.bufferedReader().readLines().also {
        val code = p.waitFor()
        if (code != 0)
            error("non zero exit code $code when executing ${command.joinToString(" ")}\noutput:${it.joinToString("\n")}")
    }
}

fun InputStream.pipeTo(out: PrintStream, prefix: String) = thread {
    this@pipeTo.bufferedReader().apply {
        try {
            var line: String?
            while (run { line = readLine(); line } != null) {
                out.println(prefix + line)
            }
        } catch (ignore: Throwable) {
        }
    }
}

class Log {
    var verbose = false

    val allowedI: Boolean
        get() = verbose

    fun i(msg: String) {
        if (allowedI)
            println(msg)
    }

    val allowedD = true
    fun d(msg: String) {
        if (allowedD)
            println(msg)
    }
}

fun Document.getElementByTagName(tagName: String): Element? {
    return this.documentElement.getElementByTagName(tagName)
}

fun Element.getElementByTagName(tagName: String): Element? {
    for (i in 0 until childNodes.length) {
        val item = childNodes.item(i)
        if (item.nodeType == Node.ELEMENT_NODE && (item as? Element)?.tagName == tagName)
            return item
    }
    return null
}

fun Element.getTextValue(): String? {
    for (i in 0 until childNodes.length) {
        val item = childNodes.item(i)
        if (item.nodeType == Node.TEXT_NODE)
            return item.nodeValue
    }
    return null
}

fun oneTimeReadmeUpdater(versionOverride: String? = null): (String, String, String) -> Unit {
    val provider: (() -> String)? = versionOverride?.let { { it } }
    return oneTimeReadmeUpdater(provider)
}

fun oneTimeReadmeUpdater(versionOverrideProvider: (() -> String)? = null): (String, String, String) -> Unit {
    val updater = object {
        var readmeUpdated = false
        fun readmeUpdater(framework: String, moduleFolder: String, version: String) {
            if (!readmeUpdated) {
                updateReadmeFileVersionString(framework, moduleFolder, versionOverrideProvider?.invoke() ?: version)
                readmeUpdated = true
            }
        }
    }
    return updater::readmeUpdater
}

class GroupFrameworkRegister(
    private val groupName: String,
    private val frameworkRegistry: MutableMap<String, (String) -> Unit>,
    private val groupRegistry: MutableMap<String, MutableList<String>>
) {
    operator fun set(framework: String, action: (String) -> Unit) {
        frameworkRegistry[framework] = action
        groupRegistry.computeIfAbsent(groupName) { mutableListOf() }.add(framework)
    }
}

