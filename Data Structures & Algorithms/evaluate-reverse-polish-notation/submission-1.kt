class Solution {
    fun evalRPN(tokens: Array<String>): Int {
      if (tokens.isEmpty()) {
            return 0
        }
        val arrayDeque = ArrayDeque<Int>()

        for (token in tokens) {

            if (token == "*") {
                val last = arrayDeque.removeLast()
                val secondLast = arrayDeque.removeLast()
                arrayDeque.addLast(secondLast * last)


            } else if (token == "-") {
                val last = arrayDeque.removeLast()
                val secondLast = arrayDeque.removeLast()
                arrayDeque.addLast(secondLast - last)

            } else if (token == "+") {
                val last = arrayDeque.removeLast()
                val secondLast = arrayDeque.removeLast()
                arrayDeque.addLast(secondLast + last)

            } else if (token == "/") {
                val last = arrayDeque.removeLast()
                val secondLast = arrayDeque.removeLast()
                arrayDeque.addLast(secondLast / last)
            } else {
                arrayDeque.addLast(token.toInt())
            }
        }
        return arrayDeque.removeLast()
    }
}
