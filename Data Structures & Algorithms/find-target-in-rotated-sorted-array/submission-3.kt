class Solution {
    //nums=[3,4,5,6,0,1,2,3]
    //target=1
    fun search(nums: IntArray, target: Int): Int {

        var left = 0
        var right = nums.size - 1

        while (left <= right) {

            val mid = left + ((right - left) / 2)
            if (target == nums[mid]) {
                return mid
            }

            //left or right portion
            if (nums[mid] >= nums[left]) {
                //left portion
                if (target > nums[mid] || target < nums[left]) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
                
            } else {
                //right portion
                if (target < nums[mid] || target > nums[right]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            }
        }
        return -1

    }
}
