class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        var leftPass = 1
        val temp = IntArray(nums.size) { 1 }
        for (i in nums.indices) {
            val curr = nums[i]
            temp[i] = leftPass
            leftPass *= curr
        }

        var rightPass = 1
        for (i in nums.size - 1 downTo 0) {
            val curr = nums[i]
            temp[i] = rightPass * temp[i]
            rightPass *= curr
        }
        return temp
    }
}
