class Solution {
    fun characterReplacement(s: String, k: Int): Int {
var left = 0
        var longestSubString = 0
        val seenMap = mutableMapOf<Char, Int>()
        var maxFreqCount = 0

        for (right in s.indices) {
            val eachChar = s[right]
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
            maxFreqCount = maxOf(maxFreqCount, seenMap[eachChar]!!)
            val windowSize = (right - left) + 1
            val toBeReplaced = windowSize - maxFreqCount

            if (toBeReplaced >k) {
                //shrink window from left
                val leftChar = s[left]
                seenMap[leftChar] = seenMap.getOrDefault(leftChar, 1) - 1
                left++
            }
            longestSubString = maxOf(longestSubString, (right - left) + 1)
        }
        return longestSubString
    }
}
