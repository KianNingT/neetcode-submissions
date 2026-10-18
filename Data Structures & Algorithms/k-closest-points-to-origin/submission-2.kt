class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {

         val maxHeap = PriorityQueue<IntArray>(compareByDescending {
            val x = it[0]
            val y = it[1]
            val sum = (x * x) + (y * y)
            val sqrt = sqrt(sum.toDouble())
            sqrt
        })

        for (coor in points) {
            maxHeap.offer(coor)
        }
        while (maxHeap.size > k) {
            maxHeap.poll()
        }

        return Array(k) {
            maxHeap.poll()
        }


    }
}
