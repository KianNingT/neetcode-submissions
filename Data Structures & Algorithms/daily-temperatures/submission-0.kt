class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
val arrayDeque = ArrayDeque<Int>()
        val res = IntArray(temperatures.size)

        for (i in temperatures.indices) {
            
            val currTemp = temperatures[i]
            
            while (arrayDeque.isNotEmpty() && temperatures[arrayDeque.last()] < currTemp) {
                val prevIndex = arrayDeque.removeLast()
                res[prevIndex] = i - prevIndex
            }
            arrayDeque.addLast(i)
        }
        return res
    }
}
