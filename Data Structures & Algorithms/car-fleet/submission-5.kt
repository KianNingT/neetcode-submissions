class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val carPairs = position.zip(speed).sortedByDescending { it.first }

        var maxTime = 0.0
        var carFleet = 0

        for ((pos, spd) in carPairs) {
            val timeNeeded = (target - pos).toDouble() / spd
            if (timeNeeded > maxTime) {
                maxTime = timeNeeded
                carFleet++
            }
        }
        return carFleet
    }
}
