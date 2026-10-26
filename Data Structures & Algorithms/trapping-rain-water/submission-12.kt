class Solution {
    fun trap(height: IntArray): Int {

        var left = 0
        var right = height.size - 1
        var maxLeft = height[0]
        var maxRight = height[height.size - 1]
        var totalWater = 0

        while (left <= right) {

            if (maxLeft < maxRight) {
                var trappedWater = maxLeft - height[left]
                if (trappedWater < 0) {
                    trappedWater = 0
                }
                totalWater += trappedWater
                maxLeft = maxOf(maxLeft, height[left])
                left++
            } else {
                var trappedWater = maxRight - height[right]
                if (trappedWater < 0) {
                    trappedWater = 0
                }
                totalWater += trappedWater
                maxRight = maxOf(maxRight, height[right])
                right--

            }
        }
        return totalWater

    }
}
