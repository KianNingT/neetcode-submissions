class Solution {
    fun maxProfit(prices: IntArray): Int {
         var maxProfit = 0
        var lowest = Int.MAX_VALUE
        for (price in prices) {
            if (price < lowest) {
                lowest = price
            } else {
                val todayProfit = price - lowest
                maxProfit = maxOf(maxProfit, todayProfit)
            }
        }
        return maxProfit
    }
}
