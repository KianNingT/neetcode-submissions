class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size) { 1 }
        var prefix = 1

        for (i in nums.indices) {
            result[i] = prefix
            prefix *= nums[i]
        }
        var postFix = 1
        for (i in nums.size - 1 downTo 0) {
            result[i] = result[i] * postFix
            postFix *= nums[i]
        }
        return result
    }
}
