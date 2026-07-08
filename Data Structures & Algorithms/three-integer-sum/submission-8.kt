class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
if (nums.isEmpty()) {
            return listOf()
        }
        val res = mutableListOf<List<Int>>()
        
        nums.sort()

        for (i in nums.indices) {

            if (i > 0 && nums[i - 1] == nums[i]) {
                continue
            }

            var left = i + 1
            var right = nums.size - 1

            val curr = nums[i]

            while (left < right) {

                val answer = curr + nums[left] + nums[right]
                if (answer > 0) {
                    right--
                    continue
                } else if (answer < 0) {
                    left++
                    continue
                } else {
                    // summed up == 0
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
