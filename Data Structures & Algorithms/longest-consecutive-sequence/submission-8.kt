class Solution {
    fun longestConsecutive(nums: IntArray): Int {
var max = 0
    val numSet = nums.toSet()
    for (num in numSet) {
        if (num - 1 !in numSet) {
            //smallest, start from here
            var count = 1
            while (num + count in numSet) {
                count++
            }
            max = maxOf(max, count)
        }
    }
    return max
    }
}
