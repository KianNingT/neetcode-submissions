class MinStack() {

    val stack1 = ArrayDeque<Int>()
    val stack2 = ArrayDeque<Int>()

//p5,p0,p2,p4,min,pop,min,pop
    fun push(`val`: Int) {
        stack1.addLast(`val`)
        if (stack2.isEmpty() || stack2.last() > `val`) {
            stack2.addLast(`val`)
        } else {
            stack2.addLast(stack2.last())
        }

    }

    fun pop() {
        stack1.removeLast()
        stack2.removeLast()
    }

    fun top(): Int {
       return stack1.last()

    }

    fun getMin(): Int {
        return stack2.last()
    }
}
