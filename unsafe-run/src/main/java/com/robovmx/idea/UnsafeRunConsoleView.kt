package com.robovmx.idea

import com.intellij.execution.ui.ConsoleView
import com.intellij.execution.ui.ConsoleViewContentType
import java.io.OutputStream
import java.io.PrintStream

/**
 * run action and redirects it stdout/error to console view
 */
internal fun ConsoleView.captureOutputOf(action: () -> Unit) {
    val originalOut = System.out
    val originalErr = System.err
    try {
        fun stream(type: ConsoleViewContentType) = PrintStream(
            object : OutputStream() {
                override fun write(b: Int) = this@captureOutputOf.print(b.toChar().toString(), type)
                override fun write(b: ByteArray, off: Int, len: Int) = this@captureOutputOf.print(String(b, off, len), type)
            }, true
        )
        System.setOut(stream(ConsoleViewContentType.NORMAL_OUTPUT))
        System.setErr(stream(ConsoleViewContentType.ERROR_OUTPUT))
        action()
    } finally {
        // restore original IOs
        System.setOut(originalOut)
        System.setErr(originalErr)
    }
}
