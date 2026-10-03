class MinStack() {


    val realStack = Stack<Int>()
    val minStack = Stack<Int>()

    fun push(`val`: Int) {
        realStack.push(`val`)
        if (minStack.isEmpty() || `val` < minStack.peek()) {
             minStack.push(`val`)
        } else {
            val smallest = minStack.peek()
            minStack.push(smallest)
        }
        // if (minStack.isNotEmpty() && `val` < minStack.peek()) {
        //     minStack.push(`val`)
        // } else {
        //     val smallest = minStack.peek()
        //     minStack.push(smallest)
        // }
    }

    fun pop() {
        realStack.pop()
        minStack.pop()
    }

    fun top(): Int {
        return realStack.peek()
    }

    fun getMin(): Int {
        return minStack.peek()
    }
}
