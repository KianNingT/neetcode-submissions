class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
 val result = IntArray(temperatures.size)

        val arrDeque = ArrayDeque<Int>()
        
        for (i in temperatures.indices) {
            val eachTemp = temperatures[i]
            
            while (arrDeque.isNotEmpty() && temperatures[arrDeque.last()] < eachTemp) {
                val poppedIndex = arrDeque.removeLast()
                result[poppedIndex] = i - poppedIndex
            }
            arrDeque.addLast(i)
        }
        return result
    }
}
