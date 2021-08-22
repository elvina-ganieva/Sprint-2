class ProblemC {

    fun main() {
        var result = 0
        val n = readInt()
        val input = readIntArray(n)

        input.sort()
        for (i in 0 until n - 1 step 2) result += input[i + 1] - input[i]
        println(result)
    }
}
