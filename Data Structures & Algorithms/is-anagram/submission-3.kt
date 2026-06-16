class Solution {
    fun isAnagram(s: String, t: String): Boolean {
     if (s.length != t.length) {
            return false
        }

        val rememberS = mutableMapOf<Char, Int>()
        for (eachChar in s) {
            rememberS[eachChar] = rememberS.getOrDefault(eachChar, 0) + 1
        }
        

        val rememberT = mutableMapOf<Char, Int>()
        for (eachChar in t) {
            rememberT[eachChar] = rememberT.getOrDefault(eachChar, 0) + 1
        }

        return rememberS == rememberT
    }
}
