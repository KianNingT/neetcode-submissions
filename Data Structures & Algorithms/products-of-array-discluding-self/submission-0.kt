class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()
        var currPos = 0
        for (j in 0 until nums.size) {
            var tempResult = 1
            for (i in 0 until nums.size) {
                if (i == currPos) {
                    continue
                }
                tempResult *= nums[i]
            }
            result.add(tempResult)
            currPos++
        }
        return result.toIntArray()
    }
}
