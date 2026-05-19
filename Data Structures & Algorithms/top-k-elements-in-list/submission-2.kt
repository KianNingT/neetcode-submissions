class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
          if (nums.isEmpty()) {
            return intArrayOf()
        }
val rememberMap = mutableMapOf<Int, Int>()

        for (num in nums) {
            rememberMap[num] = rememberMap.getOrDefault(num, 0) + 1
        }

        //[1,1,1,1,5,5,5,3,3,3,3,3,4,4,2,2,2,2]
        //[0, ]
        //[1, ]
        //[2, 4]
        //[3, 5]
        //[4, [1,2]]
        //val buckets = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        val buckets = Array<MutableList<Int>>(nums.size + 1) { mutableListOf()}
        for ((value, amount) in rememberMap) {
            buckets[amount].add(value)
        }

        val result = mutableListOf<Int>()
        for (i in buckets.size - 1 downTo 0) {
            val eachBucket = buckets[i]
            for(num in eachBucket) {
                result.add(num)
                if (result.size == k) {
                    return result.toIntArray()
                }
            }
        }
        return result.toIntArray()
    }
}
