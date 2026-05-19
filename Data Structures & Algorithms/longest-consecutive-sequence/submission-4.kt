class Solution {
    fun longestConsecutive(nums: IntArray): Int {
         if (nums.isEmpty()) {
            return 0
        }
 val numSet = nums.toSet()
        var maxVal = 1
        for (num in numSet) {
            if (!numSet.contains(num - 1)) {
                var start = 1
                //start
                repeat(nums.size - 1) {
                    if (num + start in numSet) {
                        start++
                        maxVal = maxOf(start, maxVal)
                    }
                }
            }
        }
        return maxVal
    }
}
