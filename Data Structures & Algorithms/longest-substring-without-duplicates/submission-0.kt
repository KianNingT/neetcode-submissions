class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
if (s.isEmpty()) {
            return 0
        }
        var maxLength = 0
        val seenMap = mutableMapOf<Char, Int>()
        var left = 0
        
        for (right in s.indices) {
            val eachChar = s[right]
            if (eachChar in seenMap && seenMap[eachChar]!! >= left) {
                left = seenMap[eachChar]!! + 1
            }
            seenMap[eachChar] = right
            maxLength = maxOf(maxLength, (right - left) + 1)
        }
        return maxLength
    }
}
