class Solution {
    fun search(nums: IntArray, target: Int): Int {
var left = 0
        var right = nums.size - 1
        
        while (left <= right) {
            val midPoint = left + (right - left) / 2
            if (nums[midPoint] == target)  {
                return midPoint
            }
            
            if (nums[midPoint] < target) {
                left = midPoint + 1
            } else {
                right = midPoint - 1
            }
        }
        return -1
    }
}
