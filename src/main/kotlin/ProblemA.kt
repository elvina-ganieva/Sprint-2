class ProblemA {

    private fun findFrogPosition(rightJumpLength: Int, leftJumpLength: Int, numberOfJumps: Int) {

        val rightTotal = (numberOfJumps / 2 + numberOfJumps % 2) * rightJumpLength.toLong()
        val leftTotal = (numberOfJumps / 2) * leftJumpLength.toLong()
        println(rightTotal - leftTotal)
    }

    fun main() {

        var input: IntArray
        val t = readInt()

        for (i in 0 until t) {
            input = readIntArray(3)
            findFrogPosition(input[0], input[1], input[2])
        }
    }
}
