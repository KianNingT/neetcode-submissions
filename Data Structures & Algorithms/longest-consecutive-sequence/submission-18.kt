class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        var longest = 0
        val numSet = nums.toSet()

        for (num in numSet) {

            if ((num - 1) !in numSet) {
                var incremental = 1
                while ((num + incremental) in numSet) {
                    incremental++
                }
                longest = maxOf(longest, incremental)
            }
        }
        return longest
    }
}
