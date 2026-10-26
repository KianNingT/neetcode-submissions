class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        for (row in 0 until 9) {
            val seenSet = mutableSetOf<String>()
            for (col in 0 until 9) {
                val square = board[row][col].toString()
                if (square != "." && !seenSet.add(square)) {
                    return false
                }
            }
        }
        for (row in 0 until 9) {
            val seenSet = mutableSetOf<String>()
            for (col in 0 until 9) {
                val square = board[col][row].toString()
                if (square != "." && !seenSet.add(square)) {
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
                    if (square != "." && !seenSet.add(square)) {
                    return false
                    }
                }
            }
        }
        return true

    }
}
