public class Solution {
    public string[] FindRelativeRanks(int[] score) {
        int n = score.Length;
        string[] result = new string[n];
        
        // Create a dictionary to store the original indices of the scores
        Dictionary<int, int> indexMap = new Dictionary<int, int>();
        for (int i = 0; i < n; i++) {
            indexMap[score[i]] = i;
        }
        
        // Sort the scores in descending order
        Array.Sort(score, (a, b) => b - a);
        
        // Assign ranks to athletes
        for (int i = 0; i < n; i++) {
            int originalIndex = indexMap[score[i]];
            if (i == 0) {
                result[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                result[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = (i + 1).ToString();
            }
        }
        
        return result;
    }
}
