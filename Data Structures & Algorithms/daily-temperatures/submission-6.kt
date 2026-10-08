class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

        val stack = Stack<Int>()
        val res = IntArray(temperatures.size) {0}

        for (i in temperatures.indices) {
            val eachTemp = temperatures[i]

            while (stack.isNotEmpty() && eachTemp > temperatures[stack.peek()]) {
                val oldPos = stack.peek()
                val diff = i - oldPos
                res[oldPos] = diff
                stack.pop()
            }

            stack.push(i)
        }
        return res

    }
}
