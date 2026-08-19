class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val needMap = mutableMapOf<Int, Int>()
        //value, index
        for (i in 0 until nums.size) {

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
