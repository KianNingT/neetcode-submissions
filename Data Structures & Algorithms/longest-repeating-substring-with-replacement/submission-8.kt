class Solution {
    fun characterReplacement(s: String, k: Int): Int {
    var left = 0
    var currentLongestCharQty = 0
    var longest = 0

    val seenMap = mutableMapOf<Char, Int>()
    for (right in s.indices) {
        val eachChar = s[right]
        seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
        currentLongestCharQty = maxOf(currentLongestCharQty, seenMap[eachChar]!!)

        val windowLength = (right - left) + 1
        val needReplacement = windowLength - currentLongestCharQty
        if (needReplacement <= k) {
            longest = maxOf(longest, windowLength)
        } else {
            val leftChar = s[left]
            seenMap[leftChar] = seenMap.getOrDefault(leftChar, 0) - 1
            left++
        }
    }
    return longest
    }
}
