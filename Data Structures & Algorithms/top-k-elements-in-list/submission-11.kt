class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val seenMap = mutableMapOf<Int, Int>()

        for (num in nums) {
            seenMap[num] = seenMap.getOrDefault(num, 0) + 1
        }
        //[3,10] , [4,6], [2,3], [1,8]
        //[0] -> [4,2]
        //[1] -> [3]
        //[2] -> [6,1,7]

        val buckets = Array<MutableList<Int>>(nums.size + 1) {mutableListOf()}
        for((num, freq) in seenMap) {
            buckets[freq].add(num)
        }

        val res = mutableListOf<Int>()
        for (i in buckets.size - 1 downTo 0) {

            val bucketArr = buckets[i]
            for (num in bucketArr) {
                res.add(num)
                if (res.size == k) {
                    return res.toIntArray()
                }
            }
        }
        return res.toIntArray()
    }
}
