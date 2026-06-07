class Solution {
    fun minWindow(s: String, t: String): String {
 if (t.length > s.length) {
            return ""
        }

        var res = ""
        var shortest = Int.MAX_VALUE
        val seenMap = mutableMapOf<Char, Int>()
        val needMap = mutableMapOf<Char, Int>()

        var have = 0
        var left = 0

        for (needChar in t) {
            needMap[needChar] = needMap.getOrDefault(needChar, 0) + 1
        }

        val needSize = needMap.size

        for (right in s.indices) {
            val eachChar = s[right]
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
            if (needMap[eachChar] != null && needMap[eachChar] == seenMap[eachChar]) {
                have++
            }
            while (needSize == have) {

                val windowRange = (right - left) + 1
                if (windowRange < shortest) {
                    shortest = windowRange
                    res = s.substring(left, right + 1)
                }
                val leftChar = s[left]
                seenMap[leftChar] = seenMap.getOrDefault(leftChar, 0) - 1
                if (needMap.contains(leftChar) && seenMap[leftChar]!! < needMap[leftChar]!!) {
                    have--
                }
                left++
            }
        }
        return res
    }
}
