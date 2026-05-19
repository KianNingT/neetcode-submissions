class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
 for (row in board.indices) {
            val seenSet = hashSetOf<String>()
            for (j in board.indices) {
                val square = board[row][j].toString()
                if (square == ".") {
                    continue
                }
                if (!seenSet.add(square)) {
                    return false
                }
            }
        }

        for (col in board.indices) {
            val seenSet = hashSetOf<String>()
            for (j in board.indices) {
                val square = board[j][col].toString()
                if (square == ".") {
                    continue
                }
                if (!seenSet.add(square)) {
                    return false
                }
            }
        }

        for (boxes in 0 until 9) {

            val seenSet = hashSetOf<String>()

            for (i in 0 until 3) {

                for (j in 0 until 3) {

                    val row = (boxes / 3) * 3 + i
                    val col = (boxes % 3) * 3 + j
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
