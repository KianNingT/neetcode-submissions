class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    if (strs.isEmpty()) {
        return listOf()
    }

    val seenMap = mutableMapOf<String, MutableList<String>>()
    for (eachStr in strs) {

        val eachCharArr = eachStr.toCharArray()
        eachCharArr.sort()
        val eachSortedStr = String(eachCharArr)

        if (seenMap[eachSortedStr] != null) {
            seenMap[eachSortedStr]!!.add(eachStr)
        } else {
            seenMap[eachSortedStr] = mutableListOf(eachStr)
        }
    }
    return seenMap.values.toList()
    }
}
