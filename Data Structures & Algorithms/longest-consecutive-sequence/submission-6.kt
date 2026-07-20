class Solution {
    fun longestConsecutive(nums: IntArray): Int {
    var max = 0
    for (i in nums.indices) {
        val num = nums[i]
        if (!nums.contains(num - 1)) {
            //smallest, start from here
            var count = 1
            while (num + count in nums) {
                count++
            }
            max = maxOf(max, count)
        }
    }
    return max
    }
}
