class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
if (s.isEmpty()) {
            return 0
        }
        val seenMap = mutableMapOf<Char, Int>()
        
        var left = 0
        var longest = 0
        for (right in s.indices) {
            
            val eachChar = s[right]
            if (eachChar in seenMap && seenMap[eachChar]!! >= left) {
                left = seenMap[eachChar]!! + 1
            }
            seenMap[eachChar] = right
            longest = maxOf(((right - left) + 1), longest)
        }
        return longest
    }
}
