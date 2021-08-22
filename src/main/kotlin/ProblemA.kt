class ProblemA {

    fun main() {
        var rightTotal: Long
        var leftTotal: Long

        val t = readInt()
        val input = Array(t) { IntArray(3) }

        for (i in 0 until t) input[i] = readIntArray(3)

        for (array in input) {
            rightTotal = (array[2] / 2 + array[2] % 2) * array[0].toLong()
            leftTotal = (array[2] / 2) * array[1].toLong()
            println(rightTotal - leftTotal)
        }
    }
}
