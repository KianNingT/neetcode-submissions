class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val carPairs = position.zip(speed).sortedBy { it.first }

        var maxTime = 0.0
        var carFleet = 0

        for (i in carPairs.size - 1 downTo 0) {
            val eachPair = carPairs[i]
            val timeNeeded = (target - eachPair.first).toDouble() / eachPair.second
            if (timeNeeded > maxTime) {
                maxTime = timeNeeded
                carFleet++
            }
        }
        return carFleet
    }
}
