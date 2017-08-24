package base


class BaseClass {

    data class User(val name: String, var age: Int)

    // 带默认参数的方法
    fun foo(a: Int = 0, str: String = ""){
        println("$a + value = $str")
    }

    // 过滤
    val list = listOf(1, 201, 56)
    val list2 = list.filter { it > 2 }

    // string 内插
    val name = "stest"
    val name2 = "this is $name"

    fun testWhenAndType(any: Any){
        when(any){
            is String -> println(any)
            is Int    -> println(any + 1)
            else -> println(any)
        }
    }

}