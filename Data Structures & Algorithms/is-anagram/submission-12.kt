class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        val seenMap = mutableMapOf<Char, Int>()
        if (s.length != t.length) {
            return false
        }
        for (eachChar in s) {
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
        }

        for (eachChar in t) {
            val eachVal = seenMap.getOrDefault(eachChar, 0)
            if (eachVal - 1 < 0) {
                return false
            }
            seenMap[eachChar] = eachVal - 1
        }
        return true
    }
}
