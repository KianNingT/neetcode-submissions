class Solution {
    fun isAnagram(s: String, t: String): Boolean {

         if (s.length != t.length) {
        return false
    }

    val needMap = mutableMapOf<Char, Int>()

    for (eachChar in s) {
        needMap[eachChar] = needMap.getOrDefault(eachChar, 0) + 1
    }

    for (eachChar in t) {
        needMap[eachChar] = needMap.getOrDefault(eachChar, 0) - 1
        if (needMap[eachChar]!! < 0) {
            return false
        }
    }
    return true

    }
}
