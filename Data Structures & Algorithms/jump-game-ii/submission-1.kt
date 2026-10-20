class Solution {
    fun jump(nums: IntArray): Int {

        var jump = 0
        var left = 0
        var right = 0

        while (right < nums.size - 1) {

            var furthest = 0

            for (i in left..right) {
                furthest = maxOf(furthest, nums[i] + i)
            }
            left = right + 1
            right = furthest
            jump++
        }
        return jump

    }
}
