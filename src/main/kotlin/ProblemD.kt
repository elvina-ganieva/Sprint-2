class ProblemD {

    private fun findMaxProfit(coins: LongArray, numbersOfClients: Int) {

        var maxProfit = 0L

        coins.sort()
        for (j in 0 until numbersOfClients) {
            if (maxProfit < coins[j] * (numbersOfClients - j))
                maxProfit = coins[j] * (numbersOfClients - j)
        }
        println(maxProfit)
    }

    fun main() {

        var numberOfClients: Int
        var coins: LongArray
        val t = readInt()

        for (i in 0 until t) {
            numberOfClients = readInt()
            coins = readLongArray(numberOfClients)
            findMaxProfit(coins, numberOfClients)
        }
    }
}
