class ProblemB {

    fun main() {
        var fullSet: Int
        var remainder: Int

        val t = readInt()
        val input = Array(t) { IntArray(2) }

        for (i in 0 until t) input[i] = readIntArray(2)

        for (array in input) {
            fullSet = array[0] / array[1]
            remainder = array[0] % array[1]
            for (j in 0 until array[1]) {
                for (k in 1..fullSet) print('a' + j)
            }
            for (k in 0 until remainder) print('a' + k)
            println()
        }
    }
}
