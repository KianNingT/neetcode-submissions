class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
if (s1.length > s2.length) {
            return false
        }

        var needMap = mutableMapOf<Char, Int>()

        for (eachChar in s1) {
            needMap[eachChar] = needMap.getOrDefault(eachChar, 0) + 1
        }

        val seenMap = mutableMapOf<Char, Int>()
        for (i in 0 until s1.length) {
            val eachChar = s2[i]
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
        }

        if (seenMap == needMap) {
            return true
        }

        var left = 0
        for (right in s1.length until s2.length) {

            val leftChar = s2[left]
            seenMap[leftChar] = seenMap.getOrDefault(leftChar, 0) - 1
            if (seenMap[leftChar] == 0) {
                seenMap.remove(leftChar)
            }
            left++

            val eachChar = s2[right]
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
            if (seenMap == needMap) {
                return true
            }
        }
        return false
    }
}
