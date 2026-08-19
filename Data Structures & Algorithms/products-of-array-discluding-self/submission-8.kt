class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        var leftPass = 1
        var currLeft = nums[0]

        val temp = IntArray(nums.size)
        for(i in nums.indices) {
            temp[i] = leftPass
            leftPass = leftPass * nums[i]
        }

        var rightPass = 1
        for (i in nums.size - 1 downTo 0) {
            temp[i] = rightPass * temp[i]
            rightPass = rightPass * nums[i]
        }
        return temp
    }
}
