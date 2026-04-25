class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
           val seenMap = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val remain = target - nums[i] 
            if (seenMap[remain] != null) {
                return intArrayOf(seenMap[remain]!!, i)
            }
            seenMap[nums[i]] = i
        }
        return intArrayOf()
    }
}
