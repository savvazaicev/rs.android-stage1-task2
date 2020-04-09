package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        val arr = blockA.toMutableList().filter { it::class == blockB }
        return when (blockB) {
            Int::class -> arr.sumBy { it.toString().toInt() }
            String::class -> arr.joinToString("")
            LocalDate::class -> arr.stream().map { it as LocalDate }.max(LocalDate::compareTo).get()
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            else -> ""
        }
    }
}
