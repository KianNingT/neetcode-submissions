class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
            if (k > nums.size || nums.isEmpty()) {
            return intArrayOf()
        }
        var left = 0
        val listRes = mutableListOf<Int>()

        for (right in nums.indices) {

            if ((right - left) + 1 == k) {

                var innerLeft = left
                var innerRight = right
                var currMax = nums[innerLeft]
                while (innerLeft < innerRight) {
                    if (nums[innerLeft] > nums[innerRight]) {
                        currMax = nums[innerLeft]
                        innerRight--
                    } else {
                        currMax = nums[innerRight]
                        innerLeft++
                    }
                }
                listRes.add(currMax)
                left++
            }
        }
        return listRes.toIntArray()
    }
}
