class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n =  mat.length;
        int c = 0;
        for(int t=0;t<4; t++){
            c = 0;
            for(int i = 0; i<n ;i++){
                for(int j = 0; j<=i; j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for(int i =0; i<n; i++){
                for(int j=0; j<(n+1)/2; j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][n-j-1];
                    mat[i][n-j-1] = temp;
                    if(mat[i][j]!=target[i][j]){
                        c++;
                    }
                }
            }
            for(int i =0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(mat[i][j]!=target[i][j]){
                        c++;
                        break;
                    }
                    if(c>0) break;
                }
            }
            if(c==0) return true;
        }
        return false;
    }
}
