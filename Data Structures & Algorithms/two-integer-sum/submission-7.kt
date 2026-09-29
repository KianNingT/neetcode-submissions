class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val seenMap = mutableMapOf<Int, Int>()
        //position, value

        for (i in nums.indices) {
            val curr = nums[i]
            val remain = target - curr
            if (seenMap.contains(remain)) {
                return intArrayOf(seenMap[remain]!!, i)
            }
            seenMap[curr] = i
        }
        return intArrayOf()
    }
}
