class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        
         val setRes = mutableSetOf<Int>()
        for (num in nums) {
            if (!setRes.add(num)) {
                return true
            }
        }
        return false
    }
}
