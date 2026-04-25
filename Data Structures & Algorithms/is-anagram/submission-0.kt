class Solution {
    fun isAnagram(s: String, t: String): Boolean {
         if (s.length != t.length) return false
        val map = mutableMapOf<Char, Int>()
        val map2 = mutableMapOf<Char, Int>()

        for (eachChar in s) {
            map[eachChar] = map.getOrDefault(eachChar, 0) + 1
        }

        for (eachChar in t) {
            map2[eachChar] = map2.getOrDefault(eachChar, 0) + 1
        }

        return map == map2
    }
}
