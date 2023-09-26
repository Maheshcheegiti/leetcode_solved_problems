class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int index = 0;
        int max = 0;
        for(int i = 0;i<mat.length;i++){
            int c = 0;
            for(int j =0;j<mat[i].length;j++){
                c+=mat[i][j];
            }
            if(c>max){
                max = c;
                index = i;
            }
        }
        return new int[]{index,max};
    }
}
