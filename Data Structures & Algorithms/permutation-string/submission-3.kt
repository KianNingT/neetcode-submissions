class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {

        if (s1.length > s2.length) {
            return false
        }
val seenMap = mutableMapOf<Char, Int>()
        val needMap = mutableMapOf<Char, Int>()


        var left = 0
        for (eachChar in s1) {
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
        }

        for (right in 0 until s1.length) {
            val eachChar = s2[right]
            needMap[eachChar] = needMap.getOrDefault(eachChar, 0) + 1
        }
        if (seenMap == needMap) {
            return true
        }

        for (right in s1.length until s2.length) {
            val eachChar = s2[right]
            needMap[eachChar] = needMap.getOrDefault(eachChar, 0) + 1
            
            val leftChar = s2[left]
            needMap[leftChar] = needMap.getOrDefault(leftChar, 0) - 1
            if (needMap[leftChar] == 0) {
                needMap.remove(leftChar)
            }
            
            if (needMap == seenMap) {
                return true
            }
            left++
        }
        return false
    }
}
