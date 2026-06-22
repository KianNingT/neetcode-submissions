class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
val arrayDeque = ArrayDeque<Double>()
        //[ (4,2) (1,2), (0,1), (7,1) ]
        //[ (7,1), (4,2), (1,2), (0,1) ]
        val carPairs = position.zip(speed).sortedByDescending { it.first }
        
        for (eachPair in carPairs) {

            val timeNeeded = (target - eachPair.first).toDouble() / eachPair.second

            if (arrayDeque.isEmpty() || timeNeeded > arrayDeque.last()) {
                arrayDeque.addLast(timeNeeded)
            }

        }
        return arrayDeque.size
    }
}
