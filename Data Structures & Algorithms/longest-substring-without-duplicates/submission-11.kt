class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
          if (s.isEmpty()) {
            return 0
        }
        var left = 0
        val seenMap = mutableMapOf<Char, Int>()
        var maxLength = 0

        for (right in s.indices) {
            val eachChar = s[right]
            if (eachChar in seenMap && seenMap[eachChar] != null && left <= seenMap[eachChar]!!) {
                left = seenMap[eachChar]!! + 1
            }
            seenMap[eachChar] = right
            maxLength = maxOf(maxLength, (right - left) + 1)
        }
        return maxLength
    }
}
