class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val res = mutableSetOf<Int>()
        for (num in nums) {
            if (!res.add(num)) {
                return true
            }
        }
        return false

    }
}
