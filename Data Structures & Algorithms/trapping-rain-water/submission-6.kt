class Solution {
    fun trap(height: IntArray): Int {
  var left = 0
    var right = height.size - 1

    var maxLeft = height[0]
    var maxRight = height[height.size - 1]
    var storedWater = 0

    while (left <= right) {

        if (maxLeft < maxRight) {

            var waterRemain = maxLeft - height[left]
            if (waterRemain < 0) {
                waterRemain = 0
            }
            storedWater += waterRemain
            maxLeft = maxOf(maxLeft, height[left])
            left++
        } else {

            var waterRemain = maxRight - height[right]
            if (waterRemain < 0) {
                waterRemain = 0
            }
            storedWater += waterRemain
            maxRight = maxOf(maxRight, height[right])
            right--
        }
    }
    return storedWater
    }
}
