class Solution {
    fun evalRPN(tokens: Array<String>): Int {

        val stack = ArrayDeque<Int>()
        var res = 0

        //1,2,+
        for (eachStr in tokens) {

            if (eachStr == "+") {
                val first = stack.removeLast()
                val second = stack.removeLast()
                res = second + first
                stack.addLast(res)
            } else if (eachStr == "-") {
                val first = stack.removeLast()
                val second = stack.removeLast()
                res = second - first
                stack.addLast(res)
            } else if (eachStr == "*") {
                val first = stack.removeLast()
                val second = stack.removeLast()
                res = second * first
                stack.addLast(res)
            } else if (eachStr == "/") {
                val first = stack.removeLast()
                val second = stack.removeLast()
                res = second / first
                stack.addLast(res)
            } else {
                stack.addLast(eachStr.toInt())
            }
        }
        return stack.last()
    }
}
