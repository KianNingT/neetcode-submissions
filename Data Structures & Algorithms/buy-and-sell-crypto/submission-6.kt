class Solution {
    fun maxProfit(prices: IntArray): Int {

        var profit = 0
        var minPrice = Int.MAX_VALUE
        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else {
                val todayProfit = price - minPrice
                profit = maxOf(profit, todayProfit)
            }
        }
        return profit
    }
}
