class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
 var left = 0
        var right = numbers.size - 1
        
        while (left < right) {
            var sum = numbers[right] + numbers[left]
            if (sum == target) {
                return intArrayOf(left+1, right+1)
            } else if (sum > target) {
                right--
                continue
            } else {
                left++
                continue
            }
        }
        return intArrayOf()
    }
}
