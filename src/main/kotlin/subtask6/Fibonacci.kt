package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        val arr = arrayListOf(0, 1)
        var temp = 0
        while (arr[0] * arr[1] < n) {
            temp = arr[1]
            arr[1] = arr[0] + arr[1]
            arr[0] = temp
        }
        if (arr[0]*arr[1] > n) arr.add(0) else arr.add(1)
        return arr.toIntArray()
    }
}
