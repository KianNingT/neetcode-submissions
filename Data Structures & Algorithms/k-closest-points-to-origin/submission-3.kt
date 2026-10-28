class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {

         val maxHeap = PriorityQueue<Pair<Int, Int>>( compareByDescending { pair ->
            val x = pair.first
            val y = pair.second
            val x2 = x * x
            val y2 = y * y
            val sum = x2 + y2
            val res = sqrt(sum.toDouble())
            res
        })


        //[[1,2], [3,4], [5,6]]
        for(pointArr in points) {
            maxHeap.offer(Pair(pointArr[0], pointArr[1]))
        }

        while (maxHeap.size > k) {
            maxHeap.poll()
        }

        val res = mutableListOf<IntArray>()
        while (maxHeap.isNotEmpty()) {
            val heap = maxHeap.poll()
            res.add(intArrayOf(heap!!.first, heap.second))
        }
        return res.toTypedArray()
    }
}
