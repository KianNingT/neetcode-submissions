class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
    var left = 0
    var longest = 0
    val seenMap = mutableMapOf<Char, Int>()
    for (right in s.indices) {
        val eachChar = s[right]
        if (eachChar in seenMap && seenMap[eachChar]!! >= left) {
            left = seenMap[eachChar]!! + 1
            seenMap.remove(eachChar)
        }
        seenMap[eachChar] = right
        longest = maxOf(longest, (right - left) + 1)
    }
    return longest
    }
}
