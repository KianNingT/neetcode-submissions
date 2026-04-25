class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val resultArr = mutableMapOf<String, MutableList<String>>()
        for (eachStr in strs) {
            val charArray = eachStr.toCharArray()
            charArray.sort()
            val sortedCharArr = String(charArray)

            if (resultArr[sortedCharArr] != null) {
                resultArr[sortedCharArr]!!.add(eachStr)
            } else {
                resultArr[sortedCharArr] = mutableListOf(eachStr)
            }
        }
        return resultArr.values.toList()
    }
}
