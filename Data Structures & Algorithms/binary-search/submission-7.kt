class Solution {
    fun search(nums: IntArray, target: Int): Int {

        if (nums.size == 1 && target == nums[0]) {
            return 0
        }

        var left = 0
        var right = nums.size - 1

        while (left < right) {
            if (nums[left] == target) {
                return left
            } 
            if (nums[right] == target) {
                return right
            }
            if (nums[left] > target && nums[right] > target) {
                left++
                right--
            } else if (nums[right] > target) {
                right--
            } else if (nums[left] < target) {
                left++
            }
        }
        return -1

    }
}
