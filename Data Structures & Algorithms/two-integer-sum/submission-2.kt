class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
 val rememberMap = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val curr = nums[i]
            val left = target - curr
            if (rememberMap.contains(left)) {
                return intArrayOf(rememberMap[left]!!, i)
            }
            rememberMap[curr] = i
        }
        return intArrayOf()
    }
}
