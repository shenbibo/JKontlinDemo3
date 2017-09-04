package test

import org.junit.Test
import base.joinToString2
import base.filterItem
import org.junit.Assert.*

/**
 * 一句话描述
 *
 * Created by sky on 2017/9/4.
 */
class TestForKotlinKtTest {
    @Test
    fun joinToString() {
        val list = listOf(1, 2, 3, 4)
        assertEquals("[1,2,3,4]", list.joinToString2())
        assertEquals("{1,2,3,4]", list.joinToString2("{"))
        assertEquals("[1+2+3+4]", list.joinToString2(separator = "+"))
    }

    @Test
    fun filterItem() {
        val strList = listOf("125", "sgsa", "Slg", "iir124", "a", "^&%", "A", "Ababc")

        assertEquals("[sgsa]", strList.filterItem { it.startsWith('s') }.joinToString2())

        assertEquals("[a,A,Ababc]",
                strList.filterItem { it.startsWith('a', true) }.joinToString2())

    }

}