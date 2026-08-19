class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) {
            return false
        }

        val seenMap = mutableMapOf<Char, Int>()
        for (eachChar in s) {
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) + 1
        }

        for (eachChar in t) {
            seenMap[eachChar] = seenMap.getOrDefault(eachChar, 0) - 1
            if (seenMap[eachChar]!! < 0) {
                return false
            }
       
        }
        return true
    }
}
