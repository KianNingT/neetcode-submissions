class Solution {
    fun isValid(s: String): Boolean {

        val stack = Stack<Char>()

        for (eachChar in s) {

            if (eachChar == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false
                } else {
                    stack.pop()
                }
            } else if (eachChar == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false
                } else {
                    stack.pop()
                }
            } else if (eachChar == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    return false
                } else {
                    stack.pop()
                }
            } else {
                stack.push(eachChar)
            }
        }
        return stack.isEmpty()
    }
}
