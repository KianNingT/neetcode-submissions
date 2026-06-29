class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
 var left = 1
        var right = piles.max()
        var res = right
        while (left <= right) {

            val k = left + ((right - left) / 2)
            var hoursToEat = 0.0
            for (p in piles) {
                hoursToEat += ceil(p.toDouble() / k.toDouble())
            }
            if (hoursToEat <= h) {
                res = minOf(res, k)
                right = k - 1
            } else {
                left = k + 1
            }
        }
        return res
    }
}
