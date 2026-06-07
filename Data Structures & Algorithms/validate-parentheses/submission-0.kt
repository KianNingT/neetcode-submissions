class Solution {
    fun isValid(s: String): Boolean {
  if (s.isEmpty()) {
            return true
        }

        if (s.length % 2 != 0) {
            return false
        }

        val stack = Stack<Char>()

        for (eachChar in s) {

            if (eachChar == '(' || eachChar == '[' || eachChar == '{') {
                stack.push(eachChar)
            } else {
                //it's closing bracket
                //but you can't have closing bracket if you haven't have opening bracket, that's the rule
                if (stack.isEmpty()) {
                    return false
                } else {
                    if (eachChar == ')' && stack.peek() != '(') {
                        return false
                    } else if (eachChar == ']' && stack.peek() != '[') {
                        return false
                    } else if (eachChar == '}' && stack.peek() != '{') {
                        return false
                    }
                    stack.pop()
                }
            }
        }
        return stack.isEmpty()
    }
}
