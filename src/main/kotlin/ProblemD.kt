class ProblemD {

    fun main() {
        val t = readInt()
        val numbersOfClients = IntArray(t)
        val coins = Array(t) { LongArray(0) }
        val profits = LongArray(t)

        for (i in 0 until t) {
            numbersOfClients[i] = readInt()
            coins[i] = readLongArray(numbersOfClients[i])
            coins[i].sort()
        }

        for (i in 0 until t) {
            for (j in 0 until numbersOfClients[i]) {
                if (profits[i] < coins[i][j] * (numbersOfClients[i] - j))
                    profits[i] = coins[i][j] * (numbersOfClients[i] - j)
            }
        }

        for (item in profits) println(item)
    }
}
