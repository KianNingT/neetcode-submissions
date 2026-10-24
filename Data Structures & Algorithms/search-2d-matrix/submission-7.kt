class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        for (eachArr in matrix) {
            if (eachArr[eachArr.size - 1] < target) {
                continue
            }

            var left = 0
            var right = eachArr.size - 1

            for (i in eachArr.indices) {
                val mid = left + (right - left)
                if (eachArr[mid] == target) {
                    return true
                }
                if (eachArr[mid] > target) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            }
        }
        return false

    }
}
