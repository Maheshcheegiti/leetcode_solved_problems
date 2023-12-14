class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        for(int i=0; i<m; i++ ){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for(int i=0; i<m; i++ ){
            for(int j = 0;j<n;j++){
                grid[i][j] = 2*row[i]+2*col[j]-m-n;
            }
        }
        return grid;
    }
}
