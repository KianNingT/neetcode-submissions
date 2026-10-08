class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {

          val stack = Stack<Double>()

    val combined = position.zip(speed)
        .sortedByDescending { it.first } // only change

    for ((position, speed) in combined) {
        val remain = target - position
        val time = remain.toDouble() / speed

        if (stack.isNotEmpty()) {
            if (time > stack.peek()) {
                stack.push(time)
            }
        } else {
            stack.push(time)
        }
    }

    return stack.size
    }
}
