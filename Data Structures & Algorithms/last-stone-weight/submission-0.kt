class Solution {
    fun lastStoneWeight(stones: IntArray): Int {

        val maxHeap = PriorityQueue<Int>(compareByDescending {it })

        for (stone in stones) {
            maxHeap.offer(stone)
        }

        while (maxHeap.size > 1) {
            val stoneX = maxHeap.poll()
            val stoneY = maxHeap.poll()
            if (stoneX != stoneY) {
                val diff = stoneX - stoneY
                maxHeap.offer(diff)
            }
        }
        if (maxHeap.size == 1) {
            return maxHeap.peek()
        } else {
            return 0
        }
    }
}
