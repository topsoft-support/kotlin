// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR

val xx = listOf("A", "B")

fun id(x: String) = x

fun problem(args: List<String>) = 
    args.all(xx.map(::id)::contains)

fun box(): String {
    problem(listOf("A"))
    return "OK"
}
