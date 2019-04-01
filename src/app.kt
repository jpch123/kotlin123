fun main() {
    println("HelloWorld")
    var sum = sum(3, 5)
    println(sum)
    println(sum2(3, 6))
    println(sum3(3, 7))
    printSum(3, 5)
    printSum2(3, 5)
    println(fun1().length)
    funDefaultArg()
    funDefaultArg(1)

    funDefaultArg(1, "123")
    val a: Int? = null
    funDefaultArg(a, "123")
    funDefaultArg(str = "345")
    funDefaultArg2(14, "1111") { println("最后的lab参数") }
    funDefaultArg2(1) { println("最后的lab参数") }
    funDefaultArg2(str = "3333") { println("最后的lab参数") }
    funDefaultArg2(a = 22, lam = { println("最后的lab参数") })
    funDefaultArg2(lam = { println("最后的lab参数") })

    println(sum(a = 1, b = 3))
//    println(sum(a=1,3)) err
    println(sum(1, b = 3))
    foo(strings = *arrayOf("a11", "b222", "c333"))

    printHello("jpc1")
    val s: String? = null
    printHello(s)
    printHello(null)
    printHello2("jpc2")
    printHello3("jpc3")
    val list1 = asList(1, 2, 3)
    println(list1.size)
    val list2 = asList("ab", "cd")
    println(list2.size)
}

//定义函数

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun printHello(name: String?): Unit {
    println("------printHello(name: String?): Unit------------")
    if (name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
    return Unit
}

fun printHello2(name: String?): Unit {
    println("------printHello2(name: String?): Unit------------")
    if (name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
    return
}

fun printHello3(name: String?) {
    println("------printHello3(name: String?)------------")
    if (name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
}

fun foo(vararg strings: String) {
    println("-------foo(vararg strings: String) ------------")
    for (str in strings) {
        println(str)
    }
}


fun funDefaultArg2(a: Int? = 10, str: String = "abc", lam: () -> Unit) {
    println("-------funDefaultArg2 lambda ------------")
    println("a is $a")
    println("str is $str")
}

fun funDefaultArg(a: Int? = 10, str: String = "abc") {
    println("-------funDefaultArg------------")
    println("a is $a")
    println("str is $str")
}

fun fun1(): String {
    return "abc"
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b
fun sum3(a: Int, b: Int) = {
    printSum(a, b)
    a + b

}

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a +$b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("sum of $a +$b is ${a + b}")
}


