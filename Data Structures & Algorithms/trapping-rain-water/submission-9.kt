class Solution {
    fun trap(height: IntArray): Int {

        var left = 0
        var maxLeft = height[0]

        var right = height.size - 1
        var maxRight = height[height.size - 1]

        var totalTrappedWater = 0

        while (left <= right) {

            if (maxLeft <= maxRight) {

                var storedWater = maxLeft - height[left]
                if (storedWater < 0) {
                    storedWater = 0
                }
                totalTrappedWater += storedWater
                maxLeft = maxOf(maxLeft, height[left])
                left++
            } else {

                var storedWater = maxRight - height[right]
                if (storedWater < 0) {
                    storedWater = 0
                }
                totalTrappedWater += storedWater
                maxRight = maxOf(maxRight, height[right])
                right--
            }
        }
        return totalTrappedWater
    }
}
