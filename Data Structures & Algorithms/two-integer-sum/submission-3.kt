class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        var needMap = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val curr = nums[i]
            val remain = target - curr
            if (needMap[remain] != null) {
                return intArrayOf(needMap[remain]!!, i)
            }
            needMap[curr] = i
        }
        return intArrayOf()
    }
}
