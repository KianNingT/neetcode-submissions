class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        //[ [1,2,3], [4,5,6], [7,8,9] ]
        for (eachMatrix in matrix) {
            if (target <= eachMatrix[eachMatrix.size - 1]) {
                var left = 0
                var right = eachMatrix.size - 1
                while (left <= right) {
                    val mid = left + (right - left) / 2
                    if (eachMatrix[mid] == target) {
                        return true
                    }
                    if (target > eachMatrix[mid]) {
                        left = mid + 1
                    } else {
                        right = mid - 1
                    }
                }
            }
        }

        return false
    }
}
