class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
 val cars = position.zip(speed).sortedByDescending { it.first }

    var fleets = 0
    var maxTime = 0.0

    for ((pos, spd) in cars) {
        val time = (target - pos).toDouble() / spd

        if (time > maxTime) {
            fleets++
            maxTime = time
        }
    }

    return fleets
    }
}
