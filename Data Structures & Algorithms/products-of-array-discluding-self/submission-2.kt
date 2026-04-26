class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
           var leftPref = 1
        val result = IntArray(nums.size)
        for (i in nums.indices) {
            result[i] = leftPref
            leftPref *= nums[i]
        }
        var rightPref = 1
        for (i in nums.size - 1 downTo 0) {
            result[i] = result[i] * rightPref
            rightPref *= nums[i]
        }
        return result
    }
}
