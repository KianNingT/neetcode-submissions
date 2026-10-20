class Solution {
    
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val seenMap = mutableMapOf<String, MutableList<String>>()


        for (eachStr in strs) {
            val charArr = eachStr.toCharArray()
            charArr.sort()
            val sortedStr = String(charArr)
            
            if (seenMap[sortedStr] == null) {
                seenMap[sortedStr] = mutableListOf(eachStr)
            } else {
                seenMap[sortedStr]!!.add(eachStr)
            }
        } //loop ends

        return seenMap.values.toList()
    }
}
