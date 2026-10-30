class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {

        if (s2.length < s1.length) {
            return false
        }

        val seenMap = mutableMapOf<Char, Int>()

        for (char in s1) {
            seenMap[char] = seenMap.getOrDefault(char, 0) + 1
        }

        val needMap = mutableMapOf<Char, Int>()

        for (i in 0 until s1.length) {
            val char = s2[i]
            needMap[char] = needMap.getOrDefault(char, 0) + 1
        }

        if (seenMap == needMap) {
            return true
        }

        //abc  defgacb
        var left = 0
        val start = s1.length
        for (right in start until s2.length) {
            val char = s2[right]
            needMap[char] = needMap.getOrDefault(char, 0) + 1

            val leftChar = s2[left]
            needMap[leftChar] = needMap.getOrDefault(leftChar, 0) - 1
            if (needMap[leftChar] == 0) {
                needMap.remove(leftChar)
            }
            left++
            if (seenMap == needMap) {
                return true
            }
        }
        return false
    }
}
