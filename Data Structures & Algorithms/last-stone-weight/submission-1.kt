class Solution {
    fun lastStoneWeight(stones: IntArray): Int {

        val maxHeap = PriorityQueue<Int>(compareByDescending {it} )

        for (stone in stones) {
            maxHeap.offer(stone)
        }

        while (maxHeap.size > 1) {
            val y = maxHeap.poll()
            val x = maxHeap.poll()

            if (y > x) {
                maxHeap.offer(y - x)
            }
        }
        if (maxHeap.isNotEmpty()) {
            return maxHeap.peek()
        } else {
            return 0
        }

    }
}
