// TARGET_BACKEND: JVM
// WITH_RUNTIME
// KOTLIN_CONFIGURATION_FLAGS: +JVM.INHERIT_MULTIFILE_PARTS
// FILE: box.kt

import a.*

fun box(): String = (::ok)()

// FILE: part1.kt
@file:[JvmName("MultifileClass") JvmMultifileClass]
package a

fun ok() = "OK"