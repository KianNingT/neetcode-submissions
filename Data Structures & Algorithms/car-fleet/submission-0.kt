class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
 val arrDeque1 = ArrayDeque<Double>()

        val newArr = position.zip(speed).sortedByDescending { it.first }

        //[ (7,1) , (4,2), (1,2), (0, 1) ]

        for (index in newArr.indices) {

            val eachCar = newArr[index]

            val timeNeeded = (target - eachCar.first).toDouble() / eachCar.second

            if (arrDeque1.isEmpty() || timeNeeded > arrDeque1.last()) {
                arrDeque1.addLast(timeNeeded)
            }
        }
        return arrDeque1.size
    }
}
