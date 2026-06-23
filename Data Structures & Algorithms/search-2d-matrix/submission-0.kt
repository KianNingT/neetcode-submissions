class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
val oneArr = matrix.flatMap { it.asIterable() }.toIntArray()
        
        var left = 0
        var right = oneArr.size - 1
        
        while (left <= right) {
            
            val mid = left + ((right - left) / 2)
            if (oneArr[mid] == target) {
                return true
            }
            
             if (target > oneArr[mid]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return false
    }
}
