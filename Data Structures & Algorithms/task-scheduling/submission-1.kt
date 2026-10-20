class Solution {
    fun leastInterval(tasks: CharArray, n: Int): Int {

        val seenMap = mutableMapOf<Char, Int>()
        for (task in tasks) {
            seenMap[task] = seenMap.getOrDefault(task, 0) + 1
        }

        val maxHeap = PriorityQueue<Int>(compareByDescending {it})

        for (eachMap in seenMap) {
            maxHeap.offer(eachMap.value)
        }

        var time = 0
        //FIFO
                                        //freq, availableInTurns
        val cooldownQueue = ArrayDeque<Pair<Int, Int>>()
        while (maxHeap.isNotEmpty() || cooldownQueue.isNotEmpty()) {
            time++

            if (cooldownQueue.isNotEmpty() && cooldownQueue.peek().second == time) {
                val cooldownedTask = cooldownQueue.poll()
                maxHeap.offer(cooldownedTask.first)
            }

            if (maxHeap.isNotEmpty()) {
                val maxFreq = maxHeap.poll()
                val newMaxFreq = maxFreq - 1
                if (newMaxFreq > 0) {
                    cooldownQueue.offer(Pair(newMaxFreq, (time + n) + 1))
                }
                
            }
        }
        return time
    }
}
