class Solution {
    fun longestConsecutive(nums: IntArray): Int {
       if (nums.isEmpty()) {
            return 0
        }
        val tempSet = mutableSetOf<Int>()
        for (num in nums) {
            if (num - 1 !in nums) {
                tempSet.add(num)
            }
        }
        
        var maxCount = 0
        for (num in tempSet) {
            var currNum = num
            var currMax = 0
            while (currNum in nums) {
                currNum++
                currMax++
            }
            maxCount = maxOf(maxCount, currMax)
        }
        return maxCount
    }
}
