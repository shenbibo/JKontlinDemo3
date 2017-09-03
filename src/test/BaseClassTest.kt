package test

import base.BaseClass
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

/**
 * 基本测试框架
 * Created by sky on 2017/9/4.
 */
class BaseClassTest {
    @Test
    fun testFoo() {
        println("testFooStart")
        val value: BaseClass = BaseClass()
        value.foo(123, "123456")
        value.testWhenAndType(123)
        value.testWhenAndType("ksjgk")
        value.testWhenAndType(1545L)
    }
}