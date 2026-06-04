class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
    if (s1.length > s2.length) return false

    val needMap = mutableMapOf<Char, Int>()
    val windowMap = mutableMapOf<Char, Int>()

    for (c in s1) {
        needMap[c] = needMap.getOrDefault(c, 0) + 1
    }

    var left = 0

    // build initial window
    for (right in 0 until s1.length) {
        val c = s2[right]
        windowMap[c] = windowMap.getOrDefault(c, 0) + 1
    }

    if (windowMap == needMap) return true

    // slide window
    for (right in s1.length until s2.length) {
        val newChar = s2[right]
        windowMap[newChar] = windowMap.getOrDefault(newChar, 0) + 1

        val leftChar = s2[left]
        windowMap[leftChar] = windowMap[leftChar]!! - 1
        if (windowMap[leftChar] == 0) {
            windowMap.remove(leftChar)
        }

        left++

        if (windowMap == needMap) return true
    }

    return false
    }
}
