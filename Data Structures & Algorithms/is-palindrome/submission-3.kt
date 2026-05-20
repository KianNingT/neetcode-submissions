class Solution {
    fun isPalindrome(s: String): Boolean {
   if (s.isEmpty()) {
            return true
        }

        var left = 0
        var right = s.length - 1

        while (left < right) {

            if (left < right && !s[left].isLetterOrDigit()) {
                left++
                continue
            }

            if (left < right && !s[right].isLetterOrDigit()) {
                right--
                continue
            }

            if (left < right && s[left].lowercase() != s[right].lowercase()) {
                return false
            }
            left++
            right--
        }
        return true
}
}
