class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
 var left = 1
        var right = piles.max()
        var res = right

        while (left <= right) {
            val eatingSpeedPerHour = left + ((right - left) / 2)
            var hoursToEat = 0.0
            for (p in piles) {
                hoursToEat += ceil(p.toDouble() / eatingSpeedPerHour.toDouble())
            }
            if (hoursToEat <= h) {
                res = minOf(res, eatingSpeedPerHour)
                right = eatingSpeedPerHour - 1
            } else {
                left = eatingSpeedPerHour + 1
            }
        }
        return res
    }
}
