class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        var longestStr = 0
        var tempMaxAmt = 0
        var left = 0
        val seenMap = mutableMapOf<Char, Int>()

        //"AAABABBBBBBB"
        //"ABBC"

        for (right in s.indices) {
            val eachChar = s[right]
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
            tempMaxAmt = maxOf(tempMaxAmt, seenMap[eachChar]!!)
            val length = (right - left) + 1
            if (length - tempMaxAmt > k) {
                val leftChar = s[left]
                seenMap[leftChar] = seenMap.getOrDefault(leftChar, 0) - 1
                left++
            } else {
                longestStr = maxOf(longestStr, length)
            }
        }
        return longestStr
    }
}
