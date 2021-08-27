class ProblemC {

    fun main() {

        var minNumberOfTasks = 0
        val n = readInt()
        val skills = readIntArray(n)

        skills.sort()
        for (i in 0 until n - 1 step 2) minNumberOfTasks += skills[i + 1] - skills[i]
        println(minNumberOfTasks)
    }
}
