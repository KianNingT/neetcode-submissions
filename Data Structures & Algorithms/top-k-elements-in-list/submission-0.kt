class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
         val allMap = mutableMapOf<Int, Int>()

        for (num in nums) {
            allMap[num] = allMap.getOrDefault(num, 0) + 1
        }

        //[1,1]
        //[2,4]
        //[3,5]
        //[4,2]
        //[5,4]
        val resultArr = mutableListOf<Int>()
        val listInArray = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        //[ [], [1,1], [4], [], [2,5], [3] ]
        for ((num, count) in allMap) {
            listInArray[count].add(num)
        }
        
        for (i in listInArray.size - 1 downTo 0) {
            val eachPositionList = listInArray[i]
            //[2,5]
            for (num in eachPositionList) {
                resultArr.add(num)
                if (resultArr.size == k) {
                    return resultArr.toIntArray()
                }
            }
        }
        return intArrayOf()
    }
}
