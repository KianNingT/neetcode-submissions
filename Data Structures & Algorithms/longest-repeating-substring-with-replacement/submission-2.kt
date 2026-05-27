class Solution {
    fun characterReplacement(s: String, k: Int): Int {
var left = 0
        var longestSubStr = 0
        val seenMap = mutableMapOf<Char, Int>()
        var mostFreqCount = 0

        for (right in s.indices) {
            val eachChar = s[right]
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1

            mostFreqCount = maxOf(mostFreqCount, seenMap[eachChar]!!)
            val windowSize = (right - left) + 1

            val toBeReplaced = windowSize - mostFreqCount
            if (toBeReplaced > k) {
                val leftChar = s[left]
                seenMap[leftChar] = seenMap.getOrDefault(leftChar, 0) - 1
                left++
            }
            longestSubStr = maxOf(longestSubStr, (right - left) + 1)
        }

        return longestSubStr
    }
}
