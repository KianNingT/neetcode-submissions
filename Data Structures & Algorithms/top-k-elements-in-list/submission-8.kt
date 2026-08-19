class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
val seenMap = mutableMapOf<Int, Int>()
        //value, count

        for (eachNum in nums) {
            seenMap[eachNum] = seenMap.getOrDefault(eachNum, 0) + 1
        }

        //[1,1]
        //[2,2]
        //[3,3]
        //[4,5]

        val arrayOfArrayList =  Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        for ((value, count) in seenMap) {
            arrayOfArrayList[count].add(value)
        }
        

        //0 -> 0
        //1 -> 1,2
        //2 -> 3,6
        //3 -> 4,5
        
        val result = mutableListOf<Int>()
        for (i in arrayOfArrayList.size - 1 downTo 0) {
            
            val eachPositionList = arrayOfArrayList[i]
            for (eachNum in eachPositionList) {
                result.add(eachNum)
                if (result.size == k) {
                    return result.toIntArray()
                }
            }
        }
        return result.toIntArray()
    }
}
