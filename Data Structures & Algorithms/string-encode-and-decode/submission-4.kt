class Solution {

    fun encode(strs: List<String>): String {

        var encode = ""
        if (strs.isEmpty()) {
            return ")(*)"
        }
        for (i in strs.indices) {
            encode += strs[i]
            if (i != strs.size - 1) {
                encode += "#!||-"
            }
        }
        return encode
    }

    fun decode(str: String): List<String> {
        if (str == ")(*)") {
            return listOf()
        }
        return str.split("#!||-")
    }
}
