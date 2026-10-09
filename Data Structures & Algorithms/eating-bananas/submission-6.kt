class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {

        piles.sort()

        //1,2,3,4  h = 9

        val maxAmt = piles[piles.size - 1]
        var minRate = maxAmt

        var left = 1
        var right = maxAmt

        while (left <= right) {

            val mid = left + (right - left) / 2

            var pileSum = 0
            for (i in piles.indices) {
                val pile = piles[i]
                val rate: Int = ceil(pile.toDouble() / mid).toInt()
                pileSum += rate
            }
            if (pileSum <= h) {
                right = mid - 1
                minRate = mid
            } else {
                left = mid + 1
            }
        }
        return minRate
    }
}
