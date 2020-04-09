package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var newMonth = if (month.length == 1) "0$month" else month
        var parsed: String = "Такого дня не существует"
        try {
            parsed = LocalDate.parse("$year-$newMonth-$day").format(DateTimeFormatter.ofPattern("dd MMMM, EEEE"))
                .withLocale(Locale("ru")))
        } finally {
            return parsed
        }
    }
}
