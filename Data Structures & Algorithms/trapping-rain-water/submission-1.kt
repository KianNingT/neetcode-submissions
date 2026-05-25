class Solution {
    fun trap(height: IntArray): Int {
if (height.isEmpty()) {
            return 0
        }
        var maxLeft = height[0]
        var maxRight = height[height.size - 1]
        
        var left = 0
        var right = height.size - 1
        
        var total = 0
        
        while (left <= right) {
            
            if (maxLeft < maxRight) {
                var containableAmount = maxLeft - height[left]
                maxLeft = maxOf(maxLeft, height[left])
                if (containableAmount < 0) {
                    containableAmount = 0
                }
                total += containableAmount
                left++
            } else {
                var containableAmount = maxRight - height[right]
                maxRight = maxOf(maxRight, height[right])
                if (containableAmount < 0) {
                    containableAmount = 0
                }
                total += containableAmount
                right--
            }
        }
        return total
    }
}
