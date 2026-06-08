class MinStack() {

      val stack = ArrayDeque<Int>()
        val memoryStack = ArrayDeque<Int>()

        fun push(`val`: Int) {

            stack.addLast(`val`)
            if (memoryStack.isEmpty()) {
                memoryStack.addLast(`val`)
            } else {
                val topMin = memoryStack.last()
                if (`val` <= topMin) {
                    memoryStack.addLast(`val`)
                }
            }
          

        }

        fun pop() {
            
            if (stack.last() == memoryStack.last()) {
                memoryStack.removeLast()
            }
           stack.removeLast()
        }

        fun top(): Int {
         return stack.last()
        }

        fun getMin(): Int {
           return memoryStack.last()
        }
}
