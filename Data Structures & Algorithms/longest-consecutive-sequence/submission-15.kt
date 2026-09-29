class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        val numSet = nums.toSet()

        var longest = 0
        for (num in numSet) {
            if (!numSet.contains(num - 1)) {
                var incremental = 1
                while (numSet.contains(num + incremental)) {
                    incremental++
                }
                 longest = maxOf(longest, incremental)
            }
        }
        return longest
    }
}
