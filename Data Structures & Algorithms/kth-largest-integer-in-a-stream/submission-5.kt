class KthLargest(k: Int, nums: IntArray) {

    val minHeap = PriorityQueue<Int>()
    //1,2,3,3,4
    init {
      for (eachNum in nums) {
        minHeap.offer(eachNum)
        if (minHeap.size > k) {
            minHeap.poll()
        } //3,3,4
      } 
    }
    val tempK = k

    //-1000, 1000
    //-1000, 0, 1000
    //0, 2, 1000
    

    //3,3,4
    //5,6,7,8
    fun add(`val`: Int): Int {
        minHeap.offer(`val`)
        if (minHeap.size > tempK) {
            minHeap.poll()
        }
        return minHeap.peek()
    }
}
