class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n;j++){
                if(matrix[i][j]==0){
                    arr.add(i);
                    arr.add(j);
                }
            }
        }

        for(int i =0;i<arr.size()-1;i+=2){
            int a = arr.get(i);
            int b = arr.get(i+1);
            for(int j = 0; j<n; j++){
                matrix[a][j] = 0;
            }
            for(int j =0; j<m;j++){
                matrix[j][b] = 0;
            }
        }
    }
}
