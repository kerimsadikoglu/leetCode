public class Solution {
    public int TotalNQueens(int n) {
        int[] queens = new int[n];
        return SolveNQueens(queens, 0);
    }
    
    private int SolveNQueens(int[] queens, int row) {
        int count = 0;
        if (row == queens.Length) {
            return 1; // Found a valid solution
        }
        
        for (int col = 0; col < queens.Length; col++) {
            if (IsSafe(queens, row, col)) {
                queens[row] = col;
                count += SolveNQueens(queens, row + 1);
                queens[row] = -1; // Reset the position for backtracking
            }
        }
        
        return count;
    }
    
    private bool IsSafe(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || queens[i] - i == col - row || queens[i] + i == col + row) {
                return false; // Check for conflicts with previously placed queens
            }
        }
        return true;
    }
}
