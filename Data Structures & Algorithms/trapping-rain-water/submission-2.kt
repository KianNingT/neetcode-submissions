class Solution {
    fun trap(height: IntArray): Int {
var maxLeft = height[0]
        var maxRight = height[height.size - 1]
        
        //var eachVal = minOf(maxLeft, maxRight) - curr
        
        var left = 0
        var right = height.size - 1
        var totalTrappedWater = 0
        
        while (left <= right) {
            
            if (maxLeft < maxRight) {
                
                var eachVal = maxLeft - height[left]
                if (eachVal < 0) {
                    eachVal = 0
                }
                maxLeft = maxOf(maxLeft, height[left])
                totalTrappedWater += eachVal
                left++
            } else {
                var eachVal = maxRight - height[right]
                if (eachVal < 0) {
                    eachVal = 0
                }
                maxRight = maxOf(maxRight, height[right])
                totalTrappedWater += eachVal
                right--
            }
        }
        return totalTrappedWater
    }
}
