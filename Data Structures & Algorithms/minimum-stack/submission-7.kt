class MinStack() {

      val stack = ArrayDeque<Int>()
        val memoryStack = ArrayDeque<Int>()

        fun push(`val`: Int) {
            stack.addLast(`val`)
            if (memoryStack.isEmpty()) {
                memoryStack.addLast(`val`)
            } else {
                if (`val` < memoryStack.last()) {
                    memoryStack.addLast(`val`)
                } else {
                    memoryStack.addLast(memoryStack.last())
                }
            }
        }

        fun pop() {

            memoryStack.removeLast()
           stack.removeLast()
        }

        fun top(): Int {
         return stack.last()
        }

        fun getMin(): Int {
           return memoryStack.last()
        }
}
