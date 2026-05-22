class Solution {
    fun trap(height: IntArray): Int {
           var left = 0
        var right = height.size - 1

        var maxLeft = height[0]
        var maxRight = height[height.size - 1]

        var trappedWater = 0
        //minOf(height[left], height[right]) - height[i]
        while (left <= right) {

            if (maxLeft <= maxRight) {
                var trappableWater = maxLeft - height[left]
                maxLeft = maxOf(maxLeft, height[left])
                if (trappableWater < 0) {
                    trappableWater = 0
                }
                trappedWater += trappableWater
                left++
            } else {
                var trappableWater = maxRight - height[right]
                maxRight = maxOf(maxRight, height[right])
                if (trappableWater < 0) {
                    trappableWater = 0
                }
                trappedWater += trappableWater
                right--
            }

        }
        return trappedWater
    }
}
