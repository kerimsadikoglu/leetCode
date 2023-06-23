class Solution {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        int tmp;
        for(int i=0; i<N; i++) {
            for(int j=0; j<i; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<N/2; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = tmp;
            }
        }        
    }
}