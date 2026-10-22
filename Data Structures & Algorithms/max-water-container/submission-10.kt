class Solution {
    fun maxArea(heights: IntArray): Int {

        var left = 0
        var right = heights.size - 1
        var maxArea = 0

        while (left < right) {
            val length = right - left
            val breadth = minOf(heights[left], heights[right])
            val area = length * breadth
            maxArea = maxOf(maxArea, area)

            if (heights[left] > heights[right]) {
                right--
            } else {
                left++
            }
        }
        return maxArea

    }
}
