class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
 if (nums.isEmpty()) {
            return listOf()
        }
        val res = mutableListOf<List<Int>>()

        nums.sort()
       

        for (i in nums.indices) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }
            
            var left = i + 1
            var right = nums.size - 1
            
            while (left < right) {
                val curr = nums[i]
                val sum = curr + nums[left] + nums[right]
                if ((sum > 0)) {
                    right--
                    continue
                } else if ((sum < 0)) {
                    left++
                    continue
                } else if (sum == 0) {
                    res.add(listOf(curr, nums[left], nums[right]))

                    val leftVal = nums[left]
                    while (left < right && nums[left] == leftVal) {
                        left++
                    }
                    
                    val rightVal = nums[right]
                    while (left < right && nums[right] == rightVal) {
                        right--
                    }
                }
            }
        }
        return res
    }
}
