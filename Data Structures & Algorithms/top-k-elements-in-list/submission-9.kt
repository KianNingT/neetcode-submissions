class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val seenMap = mutableMapOf<Int, Int>()
         //value, qty
         for (num in nums) {
            seenMap[num] = seenMap.getOrDefault(num, 0) + 1
         }
         //[1 , 3], [2,1], [3,4], [4, 3]

         //[1] = 2
         //[2] = 0
         //[3] = 1,4
         //[4] = 3
         val buckets = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }

         for ((value, qty) in seenMap) {
            buckets[qty].add(value)
         }

         val res = mutableListOf<Int>()
         for (i in buckets.size - 1 downTo 0) {
            val positionList = buckets[i]
            for (num in positionList) {
                res.add(num)
                if (res.size == k) {
                    return res.toIntArray()
                }
            }
         }
         return res.toIntArray()
    }
}
