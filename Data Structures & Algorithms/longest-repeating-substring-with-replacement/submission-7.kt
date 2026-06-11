class Solution {
    fun characterReplacement(s: String, k: Int): Int {
 if (s.isEmpty()) {
            return 0
        }
        var left = 0
        var longest = 0
        var currLongestCharQuantity = 0

        val seenMap = mutableMapOf<Char, Int>()

        for (right in s.indices) {
            val eachChar = s[right]
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
            currLongestCharQuantity = maxOf(currLongestCharQuantity, seenMap[eachChar]!!)

            val windowRange = (right - left) + 1
            val needReplacement = windowRange - currLongestCharQuantity
            if (needReplacement <= k) {
                longest = maxOf(longest, windowRange)
            } else {
                val leftChar = s[left]
                seenMap[leftChar] = seenMap.getOrDefault(leftChar, 0) - 1
                left++
            }
        }
        return longest
    }
}
