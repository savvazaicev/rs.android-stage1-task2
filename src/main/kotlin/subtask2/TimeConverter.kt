package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val hours = Integer.parseInt(hour)
        val minutes = if (minute[0] == '0') Integer.parseInt(minute[1].toString()) else Integer.parseInt(minute)
        val digitArray = arrayOf("one", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine")
        if (hours > 23) return ""
        return when (minutes) {
            0 -> "${digitArray[hours - 1]} o' clock"
            in (1..29).filter { it != 15 } -> {
                if (minutes == 1) "one minute past ${digitArray[hours - 1]}" else "${digitArray[minutes - 1]} minutes past ${digitArray[hours - 1]}"
            }
            15 -> "quarter past ${digitArray[hours- 1]}"
            30 -> "half past ${digitArray[hours - 1]}"
            45 -> "quarter to ${digitArray[hours]}"
            in (31..59).filter { it != 45 } -> {
                if (minutes == 31) "one minute to ${digitArray[hours - 1]}" else "${digitArray[59 - minutes]} minutes to ${digitArray[hours]}"
            }
            else -> ""
        }
    }
}
