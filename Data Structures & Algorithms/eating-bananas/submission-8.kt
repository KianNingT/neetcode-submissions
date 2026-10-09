class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {

        //1,2,3,4  h = 9

        val maxAmt = piles.max()
        var minRate = maxAmt

        var left = 1
        var right = maxAmt

//1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
        while (left <= right) {
            val mid = left + (right - left) / 2

            var attemptSum = 0
            for (i in piles.indices) {
                val pile = piles[i]
                val attemptRate = ceil(pile.toDouble() / mid.toDouble()).toInt()
                attemptSum += attemptRate
            }
            if (attemptSum <= h) {
                minRate = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return minRate
    }
}
