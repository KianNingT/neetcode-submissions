class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        val seenMap = mutableMapOf<Char, Int>()

        var left = 0
        var most = 0
        var res = 0

        for (right in s.indices) {
            val eachChar = s[right]

            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
            most = maxOf(most, seenMap[eachChar]!!)

            
            if (((right - left) + 1) - most > k) {
               val leftChar = s[left]
               seenMap[leftChar] = seenMap.getOrDefault(leftChar, 0) - 1
               left++

            } else {
                //safe
                res = maxOf(res, (right - left) + 1)
            }
        }
        return res


    }
}
