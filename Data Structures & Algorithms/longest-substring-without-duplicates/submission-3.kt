class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
 if (s.isEmpty()) {
            return 0
        }
        val seenMap = mutableMapOf<Char, Int>()

        var left = 0
        var longest = 0
        for (right in s.indices) {

            if (s[right] in seenMap && seenMap[s[right]]!! >= left) {
                left = seenMap[s[right]]!! + 1
            }
            seenMap[s[right]] = right
            longest = maxOf(((right - left) + 1), longest)
        }
        return longest
    }
}
