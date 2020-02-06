// "Replace with 'Exception()'" "true"
package ppp

@Deprecated("do not use", ReplaceWith("Exception()"))
fun x(): Throwable = RuntimeException()

val e = <caret>x()