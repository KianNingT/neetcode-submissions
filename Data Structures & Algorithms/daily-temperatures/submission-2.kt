class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val arrayDeque = ArrayDeque<Int>()
        val res = IntArray(temperatures.size)

        for (i in temperatures.indices) {
            
            while (arrayDeque.isNotEmpty() && temperatures[arrayDeque.last()] < temperatures[i]) {
                val prevIndex = arrayDeque.removeLast()
                res[prevIndex] = i - prevIndex
            }
            arrayDeque.addLast(i)
        }
        return res
    }
}
