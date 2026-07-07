class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
var prefix = 1
        val result = IntArray(nums.size) { 1 }
        for (i in nums.indices) {
            result[i] = prefix
            prefix *= nums[ i]
        }
        
        var postFix = 1
        for (i in nums.size - 1 downTo 0) {
            result[i] = postFix * result[i]
            postFix *= nums[i]
        }
        return result
    }
}
