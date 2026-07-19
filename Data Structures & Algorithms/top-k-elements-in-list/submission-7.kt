class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val seenMap = mutableMapOf<Int, Int>()

    for (num in nums) {
        seenMap[num] = seenMap.getOrDefault(num, 0) + 1
    }
    //[1, 1]
    //[2, 2]
    //[3, 3]
    //[4, 5]
    //[5, 5]

    //[0, []]
    //[1, [1]]
    //[2, [2]]
    //[3, [3]]
    //[4, [5, 6]]
    val arrStore = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
    for ((value, amount) in seenMap) {
        arrStore[amount].add(value)
    }

    val res = mutableListOf<Int>()
    for (i in arrStore.size - 1 downTo 0) {
        val eachStore = arrStore[i]
        for (eachNum in eachStore) {
            res.add(eachNum)
            if (res.size == k) {
                return res.toIntArray()
            }
        }
    }
    return res.toIntArray()
    }
}
