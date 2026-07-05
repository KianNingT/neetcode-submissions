class TimeMap() {

     private val map = mutableMapOf<String, MutableList<Pair<Int, String>>>()

        //[foo, [(bar, 1), (bar, 2), (bar, 3), (bae, 1)]
        //[yoo, [(bar, 1), (bar, 2), (bar, 3), (bae, 1)]
        fun set(key: String, value: String, timestamp: Int) {

            if (key !in map) {
                map[key] = mutableListOf()
            }
            map[key]?.add(timestamp to value)
        }

        fun get(key: String, timestamp: Int): String {

            val list = map[key] ?: return ""

            var left = 0
            var right = list.size - 1
            var result = ""

            //[1,2,3,4,7,10]
            //we want 8
            //we land at 3 which is <= 8. assign 3 as result.
            //then continue to move to -> way to search for more suitable answers that are also <= 8
            //but if time > timestamp. then just move towards <- left by assigning new right to before mid.
            while (left <= right) {
                val mid = left + ((right - left) / 2)

                val (time, value) = list[mid]

                if (time <= timestamp) {
                    result = value
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
            return result
        }
}
