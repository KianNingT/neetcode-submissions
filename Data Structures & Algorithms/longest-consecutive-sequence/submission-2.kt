class Solution {
    fun longestConsecutive(nums: IntArray): Int {
       if (nums.isEmpty()) {
            return 0
        }
        val tempSet = nums.toSet()
        var longest = 1
        for (num in tempSet) {
            if (num - 1 !in tempSet) {
                //one of the lowest value
                //start to count up with this lowest value
                var length = 1
                while (num + length in tempSet) {
                    length++
                    longest = maxOf(longest, length)
                }
            }
        }
        return longest
    }
}
