class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val seenSet = mutableSetOf<Int>()
        for (num in nums) {
            if (!seenSet.add(num)) {
                return true
            }
        }
        return false
    }
}
