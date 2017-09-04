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
    this.forEach { sb.append(it, separator) }

//    sb.append(end)
//    // 使用IntRanger
//    return sb.removeRange(sb.lastIndex -1 until sb.lastIndex).toString()

    // 或者使用以下方式
    sb.deleteCharAt(sb.lastIndex)
    return sb.append(end).toString()
}

/**
 * 简单lambadas测试，从列表中过滤给定条件的数据
 * */
fun <T> Collection<T>.filterItem(condition: (T) -> Boolean) : Collection<T>{
    val filterList = ArrayList<T>()
    for(item in this){
        if(condition(item)){
            filterList.add(item)
        }
    }

    return filterList
}