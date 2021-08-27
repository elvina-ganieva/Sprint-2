class ProblemB {

    private fun findUniformString(stringLength: Int, numberOfChars: Int) {

        val fullSet = stringLength / numberOfChars
        val remainder = stringLength % numberOfChars

        for (j in 0 until numberOfChars) {
            for (k in 1..fullSet) print('a' + j)
        }
        for (k in 0 until remainder) print('a' + k)
        println()
    }

    fun main() {

        var input: IntArray
        val t = readInt()

        for (i in 0 until t) {
            input = readIntArray(2)
            findUniformString(input[0], input[1])
        }
    }
}
