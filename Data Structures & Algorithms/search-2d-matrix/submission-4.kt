class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
val rowSize = matrix.size
        val colSize = matrix[0].size
        val totalGridSize = rowSize * colSize

        var left = 0
        var right = totalGridSize - 1

        while (left <= right) {

            val mid = left + ((right - left) / 2)

            val whichRow = mid / colSize
            val whichCol = mid % colSize

            val midValue = matrix[whichRow][whichCol]

            if (midValue == target) {
                return true
            }

            if (target > midValue) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return false
    }
}
