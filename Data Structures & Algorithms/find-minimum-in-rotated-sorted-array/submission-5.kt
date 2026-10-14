class Solution {
    fun findMin(nums: IntArray): Int {

        var left = 0
        var right = nums.size - 1
        var min = Int.MAX_VALUE

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] > nums[right]) {
                left = mid + 1
            } else if (nums[mid] < nums[left]) {
                min = minOf(min, nums[mid])
                right = mid - 1
            } else {
                //nums[mid] < right && nums[mid] > left
                min = minOf(min, nums[mid])
                right = mid - 1
            }
        }
        return min
    }
}
