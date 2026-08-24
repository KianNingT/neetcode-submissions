class Solution {
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) {
            return true
        }

        val stack = Stack<Char>()

        for (eachChar in s) {
            if (eachChar == '(' || eachChar == '[' || eachChar == '{') {
                stack.push(eachChar)
            } else {
                if (stack.isEmpty()) {
                    return false
                }
                val lastChar = stack.peek()
                if (eachChar == ')' && lastChar == '(') {
                    stack.pop()
                } else if (eachChar == ']' && lastChar == '[') {
                    stack.pop()
                } else if (eachChar == '}' && lastChar == '{') {
                    stack.pop()
                } else {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}
