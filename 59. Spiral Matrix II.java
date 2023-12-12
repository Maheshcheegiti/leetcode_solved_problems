class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix  = new int[n][n];
        spiral(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1,1);
        return matrix;
    }

    public void spiral(int[][] mat, int r1, int r2, int c1, int c2,int k) {
        if (r1 > r2 || c1 > c2) {
            return;
        }
        for (int i = c1; i <= c2; i++) {
            mat[r1][i]=k++;
        }
        for (int i = r1 + 1; i <= r2; i++) {
            mat[i][c2]=k++;;
        }
        if (r1 < r2) {
            for (int i = c2 - 1; i >= c1; i--) {
                mat[r2][i]=k++;
            }
        }
        if (c1 < c2) {
            for (int i = r2 - 1; i > r1; i--) {
                mat[i][c1]=k++;
            }
        }
        spiral(mat, r1 + 1, r2 - 1, c1 + 1, c2 - 1,k);
    }
}
