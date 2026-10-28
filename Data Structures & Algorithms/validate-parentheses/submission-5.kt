class Solution {
    fun isValid(s: String): Boolean {

        val stack = ArrayDeque<Char>()

        if (s.startsWith(']') || s.startsWith(')') || s.startsWith('}')) {
            return false
        }

        for (eachChar in s) {

            if (eachChar == ']' || eachChar == ')' || eachChar == '}') {
                if (eachChar == ']') {
                    if (stack.isEmpty() || stack.last() != '[') {
                        return false
                    } else {
                        stack.removeLast()
                    }
                }

                if (eachChar == ')') {
                    if (stack.isEmpty() || stack.last() != '(') {
                        return false
                    } else {
                        stack.removeLast()
                    }
                }

                if (eachChar == '}') {
                    if (stack.isEmpty() || stack.last() != '{') {
                        return false
                    } else {
                        stack.removeLast()
                    }
                }
            } else {
                stack.addLast(eachChar)
            }
        }

        if (stack.isNotEmpty()) {
            return false
        } else {
            return true
        }

    }
}
