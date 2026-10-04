class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

        var left = 0
        val res = IntArray(temperatures.size)
        val stack = Stack<Int>()

        //Input: temperatures = [30,38,30,36,35,40,28]
        //38
        for (right in temperatures.indices) {
            val currTemp = temperatures[right]
            while (stack.isNotEmpty() && temperatures[stack.peek()] < currTemp) {
                val poppedIndex = stack.pop()
                val range = right - poppedIndex
                res[poppedIndex] = range
            }
            stack.push(right)
        }
        return res
    }
}
