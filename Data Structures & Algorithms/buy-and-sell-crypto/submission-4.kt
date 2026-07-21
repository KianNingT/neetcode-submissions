class Solution {
    fun maxProfit(prices: IntArray): Int {

        var max = 0
        var buyPrice = Int.MAX_VALUE
        for (i in prices.indices) {
            val curr = prices[i]
            if (curr < buyPrice) {
                buyPrice = curr
            } else {
                //curr > buyPrice
                val sellPrice = curr - buyPrice
                max = maxOf(max, sellPrice)
            }
        }
        return max
    }
}
