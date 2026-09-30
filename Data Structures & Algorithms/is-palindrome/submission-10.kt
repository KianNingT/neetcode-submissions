class Solution {
    fun isPalindrome(s: String): Boolean {
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

            if (s[left].lowercase() != s[right].lowercase()) {
                return false
            }
            left++
            right--
        }
        return true
    }
}
