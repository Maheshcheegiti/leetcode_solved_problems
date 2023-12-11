class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for(int i=0; i< indices.length ; i++){
            int a = indices[i][0];
            int b = indices[i][1];

            for(int j = 0; j<n;j++){
                arr[a][j]++;
            }
            for(int j  =0; j<m;j++){
                arr[j][b]++;
            }
        }
        int odd = 0;
        for(int[] r : arr){
            for(int i: r) {
                if(i%2==1) odd++;
            }
        }
        return odd;
    }
}
