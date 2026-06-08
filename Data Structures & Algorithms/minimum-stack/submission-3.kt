class MinStack() {

    val stack = arrayListOf<Int>()
        val memoryStack = arrayListOf<Int>()

        fun push(`val`: Int) {

            stack.add(0, `val`)
            if (memoryStack.isEmpty()) {
                memoryStack.add(0, `val`)
            } else {
                val minVal = memoryStack[0]
                if (`val` < minVal) {
                    memoryStack.add(0, `val`)
                } else {
                    memoryStack.add(0, minVal)
                }
            }

        }

        fun pop() {

            memoryStack.removeAt(0)
            stack.removeAt(0)
        }

        fun top(): Int {
            return stack[0]
        }

        fun getMin(): Int {
            return memoryStack[0]
        }
}
