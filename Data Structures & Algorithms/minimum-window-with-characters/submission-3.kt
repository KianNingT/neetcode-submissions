class Solution {
    fun minWindow(s: String, t: String): String {

        if (s.length < t.length) {
            return ""
        }

        var res = ""
        var shortest = Int.MAX_VALUE

        var left = 0
        var have = 0

        // "OUZODYXAZV", t = "XYZ"
        val needMap = mutableMapOf<Char, Int>()
        val seenMap = mutableMapOf<Char, Int>()
        for (eachChar in t) {
            needMap[eachChar] = needMap.getOrDefault(eachChar, 0) + 1
        }

        val needSize = needMap.size

        for (right in s.indices) {

            val eachChar = s[right]
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
            if (needMap[eachChar] != null && seenMap[eachChar] == needMap[eachChar]) {
                have++
            }

            while (needSize == have) {

                val windowLength = (right - left) + 1
                if (windowLength < shortest) {
                    shortest = windowLength
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
