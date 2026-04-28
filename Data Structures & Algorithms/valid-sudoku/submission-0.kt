class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
         for (row in 0 until 9) {
            val rowSet = mutableSetOf<String>()
            for (col in 0 until 9) {
                val eachStr = board[row][col].toString()
                if (!rowSet.add(eachStr) && eachStr != ".") {
                    return false
                }
            }
        }


        for (row in 0 until 9) {
            val colSet = mutableSetOf<String>()
            for (col in 0 until 9) {
                val eachStr = board[col][row].toString()
                if (!colSet.add(eachStr) && eachStr != ".") {
                    return false
                }
            }
        }

        for (bigBox in 0 until 9) {
            //9 grids
            val seenSet = mutableSetOf<String>()
            for (i in 0 until 3) {
                for (j in 0 until 3) {
                    val row = (bigBox / 3) * 3 + i
                    val col = (bigBox % 3) * 3 + j

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
