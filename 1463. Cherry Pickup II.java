class Solution {
    int m;
    int n;
    Integer memo[][][];
    public int cherryPickup(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        memo = new Integer[m+1][n+1][n+1];
        return solve(grid, 0, 0, n-1);
    }

    public int solve(int[][] grid, int row, int col1, int col2){
        if(row>=m) return 0;
        if(memo[row][col1][col2]!=null) return memo[row][col1][col2];
        int cherry = grid[row][col1];
        if(col1!=col2) cherry += grid[row][col2];
        int ans = 0;
        for(int i = -1; i<=1; i++){
            for(int j = -1; j<=1; j++){
                int newRow = row + 1;
                int newCol1 = col1 + i;
                int newCol2 = col2 + j;
                if(newCol1 >= 0 && newCol1<n && newCol2>=0 && newCol2<n){
                    ans = Math.max(ans, solve(grid,newRow,newCol1,newCol2));
                }
            }
        }
        return memo[row][col1][col2] = cherry+ans;
    }
}
