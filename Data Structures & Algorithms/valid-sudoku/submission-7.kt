class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (row in board.indices) {
            val seenSet = mutableSetOf<String>()
            for (col in board.indices) {
                val square = board[row][col].toString()
                if (square == ".") {
                    continue
                }

                if (!seenSet.add(square)) {
                    return false
                }
            }
        }

        for (row in board.indices) {
            val seenSet = mutableSetOf<String>()
            for (col in board.indices) {
                val square = board[col][row].toString()
                if (square == ".") {
                    continue
                }

                if (!seenSet.add(square)) {
                    return false
                }
            }
        }

        for (grid in board.indices) {
            val seenSet = mutableSetOf<String>()
            for (j in 0 until 3) {
                for (h in 0 until 3) {
                    val row = (grid / 3) * 3 + j
                    val col = (grid % 3) * 3 + h
                    val square = board[row][col].toString()
                    if (square == ".") {
                        continue
                    }

                    if (!seenSet.add(square)) {
                        return false
                    }
                }
            }
        }
        return true
    }
}
