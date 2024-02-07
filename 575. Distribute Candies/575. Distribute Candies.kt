class Solution {
    fun distributeCandies(candyType: IntArray): Int {
        val uniqueCandies = candyType.toSet()
        val maxTypes = candyType.size / 2
        return minOf(uniqueCandies.size, maxTypes)
    }
}
