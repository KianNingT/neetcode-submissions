   class TimeMap() {

        val seenMap1 = mutableMapOf<String, MutableList<Pair<Int, String>>>()

        
        fun set(key: String, value: String, timestamp: Int) {
            if (seenMap1[key] == null) {
                seenMap1[key] = mutableListOf(Pair(timestamp, value))
            } else {
                seenMap1[key]!!.add(Pair(timestamp, value))
            }
        }

        fun get(key: String, timestamp: Int): String {
            
            
            if (seenMap1[key] == null) {
                return ""
            }

            var res = ""

            val availablePairs = seenMap1[key]
            var left = 0
            var right = availablePairs!!.size - 1
            while (left <= right) {
                val mid = left + (right - left) / 2
                if (availablePairs[mid].first == timestamp) {
                    return availablePairs[mid].second
                }
                if (availablePairs[mid].first > timestamp) {
                    right = mid - 1
                } else {
                    res = availablePairs[mid].second
                    left = mid + 1
                }
            }
            return res
        }
    }
