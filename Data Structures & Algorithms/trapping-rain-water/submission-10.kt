class Solution {
    fun trap(height: IntArray): Int {

        var left = 0
        var right = height.size - 1
        var maxLeft = height[0]
        var maxRight = height[height.size - 1]
        var totalAmount = 0

        while (left <= right) {

            if (maxLeft < maxRight) {

                var water = maxLeft - height[left]
                if (water < 0) {
                    water = 0
                }
                maxLeft = maxOf(maxLeft, height[left])
                totalAmount = totalAmount + water
                left++
            } else {

                var water = maxRight - height[right]
                if (water < 0) {
                    water = 0
                }
                maxRight = maxOf(maxRight, height[right])
                totalAmount = totalAmount + water
                right--
            }
        }
        return totalAmount
    }
}
