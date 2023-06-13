// Backtracking + DFS solution
// Time: O(2 ^ n), 29ms
// Space: O(n) for there will be only n recursion calls (excluding result), 41.6mb
class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        combineR(n, k, 1, new ArrayList<>());
        return ans;
    }
    
    private void combineR(int n, int k, int index, List<Integer> list) {
        // Base case
        if(list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        // Recursion
        for(int i = index; i <= n; i++) {
            list.add(i);
            combineR(n, k, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}