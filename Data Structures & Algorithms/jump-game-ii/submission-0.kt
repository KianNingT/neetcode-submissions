class Solution {
    fun jump(nums: IntArray): Int {

        //nums=[2,1,2,1,0]
        var jump = 0
        var left = 0
        var right = 0

        while (right < nums.size - 1) {

            var farthest = 0
            for (i in left..right) {
                farthest = maxOf(farthest, nums[i] + i)
            }

            left = right + 1
            right = farthest
            jump++
            
        }
        return jump
    }

}
