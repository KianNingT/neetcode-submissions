class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        //Input: strs = ["act","pots","tops","cat","stop","hat"]
        //Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
        val seenMap = mutableMapOf<String, ArrayList<String>>()
        for (str in strs) {
            val charArrStr = str.toCharArray()
            charArrStr.sort()
            val sortedStr = String(charArrStr)
            
            if (seenMap.contains(sortedStr)) {
                seenMap[sortedStr]!!.add(str)
            } else {
                seenMap[sortedStr] = arrayListOf(str)
            }
        }

        val res = mutableListOf<MutableList<String>>()
        for ((sorted, unsortedList) in seenMap) { 
            res.add(unsortedList)
        }
        return res
    }
}
