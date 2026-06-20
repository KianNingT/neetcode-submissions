class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
 val res = IntArray(temperatures.size)

        val arrDeque = ArrayDeque<Int>()

        for (index in temperatures.indices) {

            val currentTemp = temperatures[index]
            while (arrDeque.isNotEmpty() && temperatures[arrDeque.last()] < currentTemp) {
                val prevIndex = arrDeque.removeLast()
                val diff = index - prevIndex
                res[prevIndex] = diff
            }
            arrDeque.addLast(index)
        }
        return res
    }
}
