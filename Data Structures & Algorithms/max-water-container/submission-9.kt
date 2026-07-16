class Solution {
    fun maxArea(heights: IntArray): Int {

        var left = 0
        var right = heights.size - 1
        var maxArea = 0

        while (left < right) {

            val breadth = minOf(heights[left], heights[right])
            val area = breadth * (right - left)
            maxArea = maxOf(area, maxArea)

            if (heights[left] < heights[right]) {
                left++
            } else {
                right--
            }
        }
        return maxArea
    }
}
