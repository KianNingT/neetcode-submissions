class Solution {
    fun isAnagram(s: String, t: String): Boolean {
 if (s.length != t.length) {
            return false
        }

        val rememberSet = mutableMapOf<Char, Int>()
        for (eachChar in s) {
            rememberSet[eachChar] = rememberSet.getOrDefault(eachChar, 0) + 1
        }
        
//        val rememberT = mutableMapOf<Char, Int>()
//        for (eachChar in t) {
//            rememberT[eachChar] = rememberT.getOrDefault(eachChar, 0) + 1
//        }
//        
//        for ((eachChar, amount) in rememberT) {
//            
//        }
        
        for (eachChar in t) {
            rememberSet[eachChar] = rememberSet.getOrDefault(eachChar, 0) - 1
            if (rememberSet[eachChar]!! < 0) {
                return false
            }
        }
        return true
    }
}
