class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {


//2,3,1,5,4
//2 2,3 - 2,3,1 - 2,3,1,5 - 2,3,5 - 2,3,5,4 - 3,5,4


//2,3,1,5,4
//2,3,1 - 2,3,1,5 - 2,3,1 - 2,3,1,4 - 2,3,1

//2,3,1,5,4
//2,3,1 - 2,1, - 2,1,5 - 2,1 - 2,1,4 - 2,1

//2,3,1,5,4
//2,3,1 - 2,3 - 2,3,5 - 3,5 - 3,5,4 - 5,4
        val minHeap = PriorityQueue<Int>()

        for (num in nums) {
            minHeap.offer(num)
        }
        while (minHeap.size > k) {
            minHeap.poll()
        }
        return minHeap.peek()

    }
}
