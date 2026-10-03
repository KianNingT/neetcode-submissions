class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {

        val res = mutableListOf<Int>()

        var left = 0
        var max = Int.MIN_VALUE

                                  //pos, value
        val seenMap = mutableMapOf<Int, Int>()
        for (right in nums.indices) {
            val eachNum = nums[right]
            seenMap[right] = eachNum
            //nums = [1,2,1,0,4,2,6]
            //nums=[1,-1]
            //k=1
            max = maxOf(max, eachNum)
            if (seenMap.size == k) {
                res.add(max)
                val leftNum = nums[left]
                seenMap.remove(left)
                left++

                if (leftNum == max) {
                max = seenMap.values.maxOrNull() ?: Int.MIN_VALUE
            }
                
            }
            
        }
        return res.toIntArray()
    }
}
