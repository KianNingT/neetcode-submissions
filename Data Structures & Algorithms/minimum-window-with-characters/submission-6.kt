class Solution {
    fun minWindow(s: String, t: String): String {
        //Input: s = "OUZODYXAZV", t = "XYZ"
        //Output: "YXAZ"

        if (t.isEmpty() || s.length < t.length) {
            return ""
        }

        val seenMap = mutableMapOf<Char, Int>()
        var left = 0
        val needMap = mutableMapOf<Char, Int>()
        var fulfil = 0
        var stringAttempt = ""
        for (eachChar in t) {
            needMap[eachChar] = needMap.getOrDefault(eachChar, 0) + 1
        }

        //Input: s = "OUZODYXAZV", t = "XYZ"
        //Output: "YXAZ"
        for (right in s.indices) {
            val eachChar = s[right]
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1

            if (seenMap[eachChar] == needMap[eachChar]) {
                fulfil++
            }
            
            while (fulfil == needMap.size) {
                val tempStr = s.substring(left, right + 1)
                if (stringAttempt == "" || tempStr.length < stringAttempt.length) {
                    stringAttempt = tempStr
                }
                val leftChar = s[left]
                seenMap[leftChar] = seenMap.getOrDefault(leftChar, 0) - 1
                if (needMap.contains(leftChar) && needMap[leftChar]!! != 0 && seenMap[leftChar]!! < needMap[leftChar]!!) {
                    fulfil--
                }
                left++
            }
        }

        return stringAttempt
    }
}
