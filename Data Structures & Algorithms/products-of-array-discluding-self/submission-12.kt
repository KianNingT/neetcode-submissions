class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        var res = IntArray(nums.size) {1}
        var leftPass = 1
        for (i in nums.indices) {
            res[i] = leftPass
            leftPass = leftPass * nums[i]
        }

        var rightPass = 1
        for (i in nums.size - 1 downTo 0) {
            res[i] = rightPass * res[i]
            rightPass = rightPass * nums[i]
        }
        return res

    }
}
