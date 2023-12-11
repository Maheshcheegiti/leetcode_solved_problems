class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if(m*n!=r*c) return mat;
        int[][] nmat = new int[r][c];
        int k=0, l=0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(l>=c){
                    k++;
                    l=0;
                }
                nmat[k][l] = mat[i][j];
                l++;
            }
        }
        return nmat;
    }
}
