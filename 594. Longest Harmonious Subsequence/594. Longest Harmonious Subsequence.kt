class Solution {
    fun findLHS(nums: IntArray): Int {
        val frequencyMap = mutableMapOf<Int, Int>()
        
        // Count the frequency of each number in nums
        for (num in nums) {
            frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
        }
        
        var maxLen = 0
        
        // Iterate through the frequencyMap to find pairs of numbers
        for ((num, count) in frequencyMap) {
            if (frequencyMap.containsKey(num + 1)) {
                val currentLen = count + frequencyMap[num + 1]!!
                maxLen = maxOf(maxLen, currentLen)
            }
        }
        
        return maxLen
    }
}
