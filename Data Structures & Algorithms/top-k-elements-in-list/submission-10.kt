class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val minHeap = PriorityQueue<Pair<Int, Int>>( compareBy {it.first})

        val seenMap = mutableMapOf<Int, Int>()

        for (num in nums) {
            seenMap[num] = seenMap.getOrDefault(num, 0) + 1  
        }

        for ((num, freq) in seenMap) {
            minHeap.offer(Pair(freq, num))
            if (minHeap.size > k) {
                minHeap.poll()
            }
        }

        val res = IntArray(k)
        for (i in k - 1 downTo 0) {
            res[i] = minHeap.poll().second
        }
        return res
    }
}
