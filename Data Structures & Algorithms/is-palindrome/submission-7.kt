class Solution {
    fun isPalindrome(s: String): Boolean {

        //MADAM
        var left = 0
        var right = s.length - 1
        
        while (left < right) {
            if (!s[left].isLetterOrDigit()) {
                left++
                continue
            }
            if (!s[right].isLetterOrDigit()) {
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
