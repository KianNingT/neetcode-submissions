class Solution {
        fun characterReplacement(s: String, k: Int): Int {

        var left = 0
        val seenMap = mutableMapOf<Char, Int>()
        var maxLength = 0
        var maxLengthCharQuantity = 0

        for (right in s.indices) {
            val eachChar = s[right]

            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
            maxLengthCharQuantity = maxOf(maxLengthCharQuantity, seenMap[eachChar]!!)
            val windowLength = (right - left) + 1
            val numberOfReplacements = windowLength - maxLengthCharQuantity

            if (numberOfReplacements <= k) {
                maxLength = maxOf(maxLength, windowLength)
            } else {
                val leftChar = s[left]
                seenMap[leftChar] = seenMap.getOrDefault(leftChar, 0) - 1
                left++
            }
        }
        return maxLength
        }
}
