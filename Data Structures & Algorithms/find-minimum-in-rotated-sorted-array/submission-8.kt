class Solution {
    fun findMin(nums: IntArray): Int {

        var left = 0
        var right = nums.size - 1
        var min = Int.MAX_VALUE

        while (left <= right) {
            //4,5,6,1,2,3
            //4,5,0,1,2,3
            //1,2,3,4,5,6
            //5, 1, 2, 3, 4
            val mid = left + (right - left) / 2

            if (nums[mid] > nums[right]){
                left = mid + 1
            } else if (nums[mid] < nums[left]) {
                min = minOf(min, nums[mid])
                right = mid - 1
            } else if (nums[mid] > nums[left]) {
                min = minOf(min, nums[left])
                right = mid - 1
            } else {
                min = minOf(min, nums[left])
                return min
            }
        }
        return min
    }
}
