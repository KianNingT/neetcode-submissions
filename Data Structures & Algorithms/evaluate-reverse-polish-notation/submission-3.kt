class Solution {
    fun evalRPN(tokens: Array<String>): Int {

        val stack = Stack<Int>()
        var result = 0

        for (eachChar in tokens) {

           if (eachChar == "+") {
                    val secondLast = stack.pop()
                    val last = stack.pop()
                    result = last + secondLast
                    stack.push(result)
            } else if (eachChar == "-") {
                    val secondLast = stack.pop()
                    val last = stack.pop()
                    result = last - secondLast
                    stack.push(result)
            } else if (eachChar == "*") {
                     val secondLast = stack.pop()
                    val last = stack.pop()
                    result = last * secondLast
                    stack.push(result)
            } else if (eachChar == "/") {
                    val secondLast = stack.pop()
                    val last = stack.pop()
                    result = last / secondLast
                    stack.push(result)
            } else {
                stack.push(eachChar.toInt())
            }
        }
        return stack.peek()

    }
}
