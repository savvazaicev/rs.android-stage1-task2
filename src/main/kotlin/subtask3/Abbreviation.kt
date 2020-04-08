package subtask3

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var result = "YES"
        var startIndex = 0
        b.forEach { startIndex = a.indexOf(it, startIndex, true).also { i -> if (i == -1) result = "NO" } }
        return result
    }
}
