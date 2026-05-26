class Solution {
    fun maxProfit(prices: IntArray): Int {
 var highestProfit = 0
        var lowestPrice = Int.MAX_VALUE
        
        for (price in prices) {
            if (price < lowestPrice) {
                lowestPrice = price
            } else {
                val todayProfit = price - lowestPrice
                highestProfit = maxOf(highestProfit, todayProfit)
            }
        }
        return highestProfit
    }
}
