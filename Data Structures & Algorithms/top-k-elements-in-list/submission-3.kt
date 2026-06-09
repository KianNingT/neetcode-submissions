class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
 val seenMap = mutableMapOf<Int, Int>()
        val res = mutableListOf<Int>()
        
        for (i in nums.indices) {
            val eachNum = nums[i]
            seenMap[eachNum] = seenMap.getOrDefault(eachNum, 0) + 1
        }
        
        //[8,3]
        //[2,5]
        //[1,2]
        //[4,5]
        //[6,1]
        val bucket = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        for ((value, count) in seenMap) {
            bucket[count].add(value)
        }
        
       
        
        //0 -> []
        //1 -> [6]
        //2 -> [1]
        //3 -> [8]
        //4 -> []
        //5 -> [2,4]

        for (i in bucket.size - 1 downTo 1) {
            val eachBucket = bucket[i]
             for (eachNum in eachBucket) {
                res.add(eachNum)
                if (res.size == k) {
                    return res.toIntArray()
                }
            }
        }
        return res.toIntArray()
    }
}
