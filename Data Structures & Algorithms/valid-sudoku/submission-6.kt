class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
  for (row in 0 until 9) {
        val seenSet = mutableSetOf<String>()
        for (col in 0 until 9) {
            val eachGrid = board[row][col].toString()
            if (!seenSet.add(eachGrid) && eachGrid != ".") {
                return false
            }
        }
    }

    for (row in  0 until 9) {
        val seenSet = mutableSetOf<String>()
        for (col in  0 until 9) {
            val eachGrid = board[col][row].toString()
            if (!seenSet.add(eachGrid) && eachGrid != ".") {
                return false
            }
        }
    }

    for (grid in  0 until 9) {
        val seenSet = mutableSetOf<String>()
        for (i in 0 until 3) {
            for (j in 0 until 3) {

                val row = (grid / 3) * 3 + i
                val col = (grid % 3) * 3 + j

                val eachGrid = board[row][col].toString()
                if (!seenSet.add(eachGrid) && eachGrid != ".") {
                    return false
                }
            }
        }
    }
    return true
    }
}
