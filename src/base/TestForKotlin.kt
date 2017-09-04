package base

/**
 *
 * 基本功能测试
 * Created by sky on 2017/9/4.
 */

/**
 * 命名参数测试
 */
fun <T> Collection<T>.joinToString2(start: String = "[",
                                 separator: String = ",",
                                 end: String = "]"): String {
    val sb = StringBuilder()
    sb.append(start)
    this.forEach { sb.append(it).append(separator) }
    sb.append(end)


    // 使用IntRanger
    return sb.removeRange(sb.lastIndex -1 until sb.lastIndex).toString()
}