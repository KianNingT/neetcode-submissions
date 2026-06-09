class Solution {
    fun trap(height: IntArray): Int {
     var left = 0
        var right = height.size - 1

        var maxLeft = height[0]
        var maxRight = height[height.size - 1]
        
        var total = 0

        while (left < right) {
            
            if (maxLeft <= maxRight) {
                left++
                var currTrapAmount = maxLeft - height[left]
                if (currTrapAmount < 0) {
                    currTrapAmount = 0
                }
                total += currTrapAmount
                maxLeft = maxOf(maxLeft, height[left])
                
            } else {
                right--
                var currTrapAmount = maxRight - height[right]
                if (currTrapAmount < 0) {
                    currTrapAmount = 0
                }
                total += currTrapAmount
                maxRight = maxOf(maxRight, height[right])
                
            }
        }
        return total
    }
}
