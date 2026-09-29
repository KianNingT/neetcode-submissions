class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
for (row in 0 until 9) {
            val seenSet = mutableSetOf<String>()
            for (col in 0 until 9) {
                val square = board[row][col].toString()
                if (square == ".") {
                    continue
                }
                if (!seenSet.add(square)) {
                    return false
                }
            }
        }

        for (row in 0 until 9) {
            val seenSet = mutableSetOf<String>()
            for (col in 0 until 9) {
                val square = board[col][row].toString()
                if (square == ".") {
                    continue
                }
                if (!seenSet.add(square)) {
                    return false
                }
            }
        }

        for (grid in 0 until 9) {
            val seenSet = mutableSetOf<String>()
            for (hor in 0 until 3) {
                for (ver in 0 until 3) {
                    val row = (grid / 3) * 3 + hor
                    val col = (grid % 3) * 3 + ver
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
