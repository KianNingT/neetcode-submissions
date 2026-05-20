class Solution {
    fun isPalindrome(s: String): Boolean {
if (s.isEmpty()) {
            return true
        }

        var left = 0
        var right = s.length - 1

        while (left < right) {
           if (!s[left].isLetterOrDigit() || s[left] == ' ') {
                left++
                continue
            }
            if (!s[right].isLetterOrDigit() || s[right] == ' ') {
                right--
                continue
            }
            if (s[left].equals(s[right], ignoreCase = true)) {
                left++
                right--
            } else {
                return false
            }
        }
        return true
}
}
