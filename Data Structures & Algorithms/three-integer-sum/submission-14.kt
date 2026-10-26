class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        val res = mutableListOf<List<Int>>()
        nums.sort()

        for (i in nums.indices) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }
            var left = i + 1
            var right = nums.size - 1
            while (left < right) {

                val sum = nums[i] + nums[left] + nums[right]
                if (sum == 0) {
                    res.add(listOf(nums[i], nums[left], nums[right]))

                    val usedLeft = nums[left]
                    while (left < right && nums[left] == usedLeft) {
                        left++
                    }

                    val usedRight = nums[right]
                    while (left < right && nums[right] == usedRight) {
                        right--
                    }


                } else {
                    if (sum > 0) {
                        right--
                    } else if (sum < 0) {
                        left++
                    }
                }
            }
        }
        return res.toList()

    }
}
