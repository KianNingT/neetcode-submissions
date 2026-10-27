class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {

        var sum = 0
        var res = 0
        var previousRes = Int.MAX_VALUE
        var previousSum = 0
        var left = 0

        val seenMap = mutableMapOf<Int, Int>()
        for (right in nums.indices) {

            val eachNum = nums[right]
            seenMap[right] = eachNum
            sum += eachNum
            res++

            while (sum >= target && left <= right) {
                previousRes = minOf(previousRes, res)
                previousSum = sum
                val leftNum = seenMap[left]
                sum -= leftNum!!
                left++
                res--
            }
        }
        if (previousSum >= target) {
            return previousRes
        } else {
            return 0
        }
    }
}
