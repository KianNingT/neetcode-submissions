class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        var leftPass = 1
        var temp = IntArray(nums.size) { 1 }
        for(i in nums.indices) {
            temp[i] = leftPass
            leftPass = nums[i] * leftPass
        }

        var rightPass = 1
        for(i in nums.size - 1 downTo 0) {
            temp[i] = rightPass * temp[i]
            rightPass = rightPass * nums[i]
        }
        return temp
    }
}
