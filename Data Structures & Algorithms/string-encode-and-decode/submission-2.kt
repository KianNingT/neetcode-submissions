class Solution {

 fun encode(strs: List<String>): String {

        if (strs.isEmpty()) {
            return "et2355"
        }
        var res: String = ""
        for (i in strs.indices) {
            if (i == 0) {
                res = res + strs[i]
            } else {
                res = res + "|=-|" + strs[i]
            }
        }
        return res
    }

    fun decode(str: String): List<String> {

        if (str == "et2355") {
            return listOf()
        }
        val result: List<String> = str.split("|=-|").map { it }
        return result
    }
}
