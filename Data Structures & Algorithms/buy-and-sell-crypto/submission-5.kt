class Solution {
    fun maxProfit(prices: IntArray): Int {

        var maxP = 0
        var buyPrice = Int.MAX_VALUE

        for (i in prices.indices) {

            if (prices[i] < buyPrice) {
                buyPrice = prices[i]
            } else {
                val todayProfit = prices[i] - buyPrice
                maxP = maxOf(maxP, todayProfit)
            }
        }
        return maxP
    }
}
