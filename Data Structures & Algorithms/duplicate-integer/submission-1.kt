class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var numSet = mutableSetOf<Int>()
        for (num in nums) {
            if (!numSet.add(num)) {
                return true
            }
        }
        return false
    }
}
