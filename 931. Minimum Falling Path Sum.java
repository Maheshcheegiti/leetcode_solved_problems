class Solution {
    int m;
    int n;
    Integer memo[][];

    public int solve(int[][] matrix, int row, int col){
        if(row>=m) return 0;
        if(memo[row][col]!=null) return memo[row][col];
        int sum = matrix[row][col];

        int ans = Integer.MAX_VALUE;
        for(int i = -1; i<=1; i++){
            int newCol = col+i;
            if(newCol>=0 && newCol<n) ans = Math.min(ans, solve(matrix,row+1, newCol));
        }

        return memo[row][col] = sum+ans;

    }

    public int minFallingPathSum(int[][] matrix) {
        int result = Integer.MAX_VALUE;
        m = matrix.length;
        n = matrix[0].length;
        memo = new Integer[m][n];
        int row  = 0;
        for(int col = 0; col<n ; col++){
            result = Math.min(result, solve(matrix, row, col ));
        }
        return result;
    }
}
