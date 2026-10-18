class KthLargest(k: Int, nums: IntArray) {

    val minHeap = PriorityQueue<Int>()
    val tempK = k

    init {
      for (num in nums) {
            minHeap.offer(num)
        }
        while (minHeap.size > k) {
            minHeap.poll()
        }
    }

 
    fun add(`val`: Int): Int {
        minHeap.offer(`val`)
        if (minHeap.size > tempK) {
            minHeap.poll()
        } 

        return minHeap.peek()
    }
}
