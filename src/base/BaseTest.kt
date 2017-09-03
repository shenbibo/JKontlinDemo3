package base


/**
 * 注释
 *
 */
fun main(args: Array<String>) {
    listTest()

    baseClassTest()

    labelTest()

    returnLabelTest()
}

private fun listTest() {
    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map(String::toUpperCase)
            .forEach(::println)
}

private fun baseClassTest() {
    println("baseClassTest")
    val baseObj = BaseClass()
    baseObj.foo()
    baseObj.testWhenAndType(3)
    baseObj.testWhenAndType("14654")
    baseObj.testWhenAndType(BaseClass.User("112", 45))
    println("baseClassTestEnd\n")
}

private fun labelTest() {
    println("labelTest")
    val list = listOf(1, 2, 3, 4)
    val list1 = listOf(4, 5, 6, 7)
    val list2 = listOf(11, 2456, 36455, 4456)
    val list3 = listOf(1456, 246, 364, 446)
    val twoLists = listOf(list, list1, list2, list3)

    firstLoop@ for (items in twoLists) {
        secondLoop@ for (item2 in items) {
            if (item2 < 2) {
                // 跳转到指定位置继续执行下一次的迭代
                continue@firstLoop
            }
            if (item2 > 36444) {
                // break 跳出当前循环到指定位置
                break@secondLoop
            }

            println(item2)
        }
    }
    println("label test end\n")
}

private fun returnLabelTest() {
    println("returnLabelTest")
    val ints = listOf(1, 2, 3, 4)
    ints.forEach each@ {
        // return@each 跳出当前此的循环迭代，继续执行下一次
        if (it == 1) return@each
        print(it)
    }
    println("returnLabelTest End\n")
}

