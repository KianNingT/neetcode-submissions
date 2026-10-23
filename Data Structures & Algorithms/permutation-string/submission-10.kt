class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {

        if (s2.length < s1.length) {
            return false
        }
        var left = 0
        val seenMap = mutableMapOf<Char, Int>()

        //s1="ab"
        //s2="eidboaoo"
        for (eachChar in s1) {
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
        }

        val needMap = mutableMapOf<Char, Int>()
        for (right in 0 until s1.length) {
            val eachChar = s2[right]
            needMap[eachChar] = needMap.getOrDefault(eachChar, 0) + 1
        }
        if (needMap == seenMap) {
            return true
        }

        for (right in s1.length until s2.length) {
            val leftChar = s2[left]
            needMap[leftChar] = needMap.getOrDefault(leftChar, 0) - 1
            if (needMap[leftChar] == 0) {
                needMap.remove(leftChar)
            }
            left++
            val eachChar = s2[right]
            needMap[eachChar] = needMap.getOrDefault(eachChar, 0) + 1
            if (needMap == seenMap) {
                return true
            }
        }
        return false
    }
}
