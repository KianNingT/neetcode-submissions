class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.isEmpty()) {
            return listOf()
        }

        val resultMap = mutableMapOf<String, MutableList<String>>()
        for (eachStr in strs) {

            val eachCharArr = eachStr.toCharArray()
            eachCharArr.sort()
            val finalEach = String(eachCharArr)

            if (resultMap[finalEach] != null) {
                resultMap[finalEach]!!.add(eachStr)
            } else {
                resultMap[finalEach] = mutableListOf(eachStr)
            }
        }
        return resultMap.values.toList()
        
    }
}
