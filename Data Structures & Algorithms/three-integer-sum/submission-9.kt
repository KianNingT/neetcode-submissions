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

                while (left < right) {

                    val sum = nums[i] + nums[left] + nums[right]

                    if (sum == 0) {
                        res.add(listOf(nums[i], nums[left], nums[right]))
                        
                        //added, now try more
                        
                        val usedLeft = nums[left]
                        while (left < right && nums[left] == usedLeft) {
                            left++
                            continue
                        }
                        val usedRight = nums[right]
                        while (left < right && usedRight == nums[right]) {
                            right--
                            continue
                        }
                    } else {
                        if (sum > 0) {
                            right--
                        } else {
                            left++
                    }
                    }
                    
                    
                }
            }
            return res
    }
}
