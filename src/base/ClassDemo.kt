/**
 * 用于测试类基本结构的DEMO
 *
 */
package base

open class BaseUser constructor(var name: String, var age: Int) {
    var customName: String = name
    open var customAge = age
    var customWight: Int = 0

    constructor(name: String, age: Int, wight: Int) : this(name, age) {
        customWight = wight
    }

    init {
        println("this is base class")
    }

    fun test() {
        println("base test")
    }

    open fun test2() {
        println("base test2")
    }

}


class Student : BaseUser {
    // 或者使用这种方式申明
    //class Student constructor(name: String, age: Int): BaseUser(name, age){
    //
    //}

    override var customAge: Int
        get() = super.customAge
        set(value) {
            super.customAge = value * value
        }

    constructor(name: String, age: Int) : super(name, age) {
        customWight += age
    }

    constructor(name: String, age: Int, wight: Int) : super(name, age, wight) {
        customWight += age
    }

    override fun test2() {
        super.test2()
        println("customAge = $customAge")
        println("customWight = $customWight")
    }
}

fun main(args: Array<String>) {
    var student = Student("456", 45)

    student.test()
    student.test2()
    // result   customAge = 45
    //          customWight = 45

    var student2 = Student("122", 78, 77)
    student2.customAge = 12
    student2.test2()
    //    customAge = 144
    //    customWight = 155
}

