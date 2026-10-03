class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        var left = 0
        var longestLength = 0
        val seenMap = mutableMapOf<Char, Int>()
        for (right in s.indices) {
            val eachChar = s[right]

            //s="dvdf"
            //a="abcabbbbbcd"
            //b="abcabca"
            //c="pwwkew"
            while(seenMap[eachChar] != null && seenMap[eachChar]!! >= left) {
                left++
            }
            seenMap[eachChar] = right
            longestLength = maxOf(longestLength, (right - left) + 1)
        }
        return longestLength
    }
}
