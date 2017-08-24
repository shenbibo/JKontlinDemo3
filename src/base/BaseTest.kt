package base

/**
 * 注释
 *
 */
fun main(args: Array<String>) {
    listTest()

    baseClassTest()
}

private fun baseClassTest() {
    val baseObj = BaseClass()
    baseObj.foo()
    baseObj.testWhenAndType(3)
    baseObj.testWhenAndType("14654")
    baseObj.testWhenAndType(BaseClass.User("112", 45))
}

private fun listTest(){
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}