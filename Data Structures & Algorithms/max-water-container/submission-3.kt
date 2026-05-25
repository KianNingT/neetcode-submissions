class Solution {
    fun maxArea(heights: IntArray): Int {
 var left = 0
        var right = heights.size - 1

        var maxArea = 0

        while (left < right) {

            val leftHeight = heights[left]
            val rightHeight = heights[right]
            val length = right - left
            val breadth = minOf(leftHeight, rightHeight)
            
            val currArea = length * breadth
            maxArea = maxOf(maxArea, currArea)
            
            if (heights[left] < heights[right]) {
                left++
            } else {
                right--
            }
        }
        return maxArea
    }
}
