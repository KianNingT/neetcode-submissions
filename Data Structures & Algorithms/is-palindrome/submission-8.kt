class Solution {
    fun isPalindrome(s: String): Boolean {

        //MADAM
        var left = 0
        var right = s.length - 1
        
        while (left < right) {
            val leftChar = s[left]
            val rightChar = s[right]
            if (!leftChar.isLetterOrDigit()) {
                left++
                continue
            }
            if (!rightChar.isLetterOrDigit()) {
                right--
                continue
            }
            if (leftChar.lowercase() != rightChar.lowercase()) {
                return false
            } 
            left++
            right--
        }
        return true
    }
}
