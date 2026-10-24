class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {

        var left = 1
        var maxSpeed = piles.max()
        var right = maxSpeed
        val sum = piles.sum()
        var hoursNeeded = 0.0
        
        //1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,1,18,19,20
        while (left < right) {
            hoursNeeded = 0.0
            val mid = left + (right - left) / 2
          for (pile in piles) {
            val k = ceil(pile.toDouble() / mid.toDouble())
            hoursNeeded += k
          }
          if (hoursNeeded > h) {
            left = mid + 1
          } else {
            right = mid
          }
        }
        return right
    }
}
