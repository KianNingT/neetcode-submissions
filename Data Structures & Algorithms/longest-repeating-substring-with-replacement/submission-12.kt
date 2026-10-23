class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        var left = 0
        var longest = 0

        var historicalMost = 0
        val seenMap = mutableMapOf<Char,Int>()

        //AAABABB
        //"XYYX"
        //AABABBA
        //AABABBA
        for (right in s.indices) {
            val eachChar = s[right]
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1

            historicalMost = maxOf(historicalMost, seenMap[eachChar]!!)
            val length = (right - left) + 1
            if (length - historicalMost > k) {
                val leftChar = s[left]
                seenMap[leftChar] = seenMap.getOrDefault(leftChar, 0) - 1
                left++   
            }
            longest = maxOf(longest, (right - left) + 1)
        }
        return longest
    }
}
