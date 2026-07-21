class Solution {
    fun trap(height: IntArray): Int {
    var left = 0
    var right = height.size - 1

    var maxLeft = height[0]
    var maxRight = height[height.size - 1]
    var totalWater = 0
    while (left <= right) {

        if (maxLeft > maxRight) {
            var storedWater = maxRight - height[right]
            if (storedWater <= 0) {
                storedWater = 0
            }
            totalWater += storedWater
            maxRight = maxOf(maxRight, height[right])
            right--

        } else {
            var storedWater = maxLeft - height[left]
            if (storedWater < 0) {
                storedWater = 0
            }
            totalWater += storedWater
            maxLeft = maxOf(maxLeft, height[left])
            left++
        }
    }
    return totalWater
    }
}
