class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        var left = 1
        val res = IntArray(nums.size)
        for (i in nums.indices) {
            res[i] = left
            left = left * nums[i]
        }

        var right = 1
        for (i in nums.size - 1 downTo 0) {
            res[i] = right * res[i]
            right = right * nums[i]
        }
        return res
    }
}
