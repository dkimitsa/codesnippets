package com.robovmx.idea;

import com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.idea.devkit.build.PluginBuildConfiguration;
import org.jetbrains.idea.devkit.module.PluginModuleType;
import org.jetbrains.idea.maven.importing.MavenImporter;
import org.jetbrains.idea.maven.importing.MavenRootModelAdapter;
import org.jetbrains.idea.maven.project.MavenProject;
import org.jetbrains.idea.maven.project.MavenProjectChanges;
import org.jetbrains.idea.maven.project.MavenProjectsProcessorTask;
import org.jetbrains.idea.maven.project.MavenProjectsTree;

import java.util.List;
import java.util.Map;

/**
 * Hack to import Intellij Idea DevKit based plugin project from Maven project
 * Plugin perform similar job as "Intellij plugin development with Maven" (com.guidewire.build.ijdevkitmvn) but
 * in simplified manner with following difference:
 * - keeps itself as JAVA_MODULE
 * - override module type in process (its pure hack)
 * to have this plugin activated maven project should have `ij.plugin` property set to true
 * plugin also able to override plugin manifest location by picking one from `ij.pluginDescriptor` property
 *
 * @author dkimitsa
 */
public class DevKitPluginMavenModuleImporter extends MavenImporter {

    public DevKitPluginMavenModuleImporter() {
        super("com.robovmx.build", "idea-from-maven-plugin");
    }

    @Override
    public boolean isApplicable(MavenProject mavenProject) {
        return Boolean.parseBoolean(mavenProject.getProperties().getProperty("ij.plugin"));
    }

    @Override
    public void process(@NotNull IdeModifiableModelsProvider modifiableModelsProvider, @NotNull Module module,
                        @NotNull MavenRootModelAdapter rootModel, @NotNull MavenProjectsTree mavenModel,
                        @NotNull MavenProject mavenProject, @NotNull MavenProjectChanges changes,
                        @NotNull Map<MavenProject, String> mavenProjectToModuleName,
                        @NotNull List<MavenProjectsProcessorTask> postTasks) {
        // hack the module type
        module.setModuleType(PluginModuleType.ID);

        // update manifest location
        String manifestLocation = mavenProject.getProperties().getProperty("ij.pluginDescriptor");
        if (manifestLocation != null) {
            PluginBuildConfiguration config = PluginBuildConfiguration.getInstance(module);
            if (config != null) {
                VirtualFile basedir = mavenProject.getDirectoryFile();
                VirtualFile pluginXml = basedir.findFileByRelativePath(manifestLocation);
                if (pluginXml != null && pluginXml.exists()) {
                    config.setPluginXmlFromVirtualFile(pluginXml);
                }
            }
        }
    }
}
