class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var left = 0
        var right = matrix[0].size - 1

        while (left < matrix.size && right >= 0) {

            if (matrix[left][right] == target) {
                return true
            } else if (target > matrix[left][right]) {
                left++
            } else {
                right--
            }
        }

        return false
    }
}
