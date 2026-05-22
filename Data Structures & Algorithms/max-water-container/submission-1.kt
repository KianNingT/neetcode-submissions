class Solution {
    fun maxArea(height: IntArray): Int {
 var left = 0
        var right = height.size - 1
        var biggest = 0

        while (left < right) {

            val area = (right - left) * minOf(height[left], height[right])
            biggest = maxOf(biggest, area)

            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        return biggest
    }
}
