class Solution {
    fun maxArea(heights: IntArray): Int {
  if (heights.isEmpty()) return 0

        var left = 0
        var right = heights.size - 1
        var max = 0
        while (left < right) {
            val length = minOf(heights[left], heights[right])
            val breadth = right - left
            val currArea = length * breadth
            max = maxOf(max, currArea)
            if (heights[left] < heights[right]) {
                left++
            } else {
                right--
            } 
        }
        return max
    }
}
