class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
if (nums.isEmpty()) {
            return listOf()
        }
        val res = mutableListOf<List<Int>>()

        nums.sort()


        for (i in nums.indices) {
            val curr = nums[i]
            if (i > 0 && curr == nums[i - 1]) {
                continue
            }

            var left = i + 1
            var right = nums.size - 1

            while (left < right) {

                val sum = curr + nums[left] + nums[right]

                if (sum < 0) {
                    left++
                    continue
                } else if (sum > 0) {
                    right--
                    continue
                } else if (sum == 0) {
                    res.add(listOf(curr, nums[left], nums[right]))
                    
                    val usedLeft = nums[left]
                    while (left < right && usedLeft == nums[left]) {
                        left++
                    }
                    
                    val usedRight = nums[right]
                    while (left < right && usedRight == nums[right]) {
                        right--
                    }
                }
            }
        }
        return res
    }
}
