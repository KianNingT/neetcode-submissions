class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        for (i in 0 until 9) {
            val seenSet = mutableSetOf<String>()
            for (j in 0 until 9) {
                val eachChar = board[i][j].toString()
                if (!seenSet.add(eachChar) && eachChar != ".") {
                    return false
                }
            }
        }

         for (i in 0 until 9) {
            val seenSet = mutableSetOf<String>()
            for (j in 0 until 9) {
                val eachChar = board[j][i].toString()
                if (!seenSet.add(eachChar) && eachChar != ".") {
                    return false
                }
            }
        }

        for (grid in 0 until 9) {
            val seenSet = mutableSetOf<String>()
            for (i in 0 until 3) {
                for (j in 0 until 3) {
                    val row = (grid / 3) * 3 + i
                    val col = (grid % 3) * 3 + j
                    val square = board[row][col].toString()
                     if (!seenSet.add(square) && square != ".") {
                        return false
                    }
                }
            }
        }
        return true
    }
}
