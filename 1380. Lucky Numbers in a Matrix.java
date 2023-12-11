class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i< matrix.length ; i++){
            int minv = Integer.MAX_VALUE;
            int minIn = 9999999;
            for(int j = 0; j< matrix[i].length; j++){
                if(matrix[i][j]<minv){
                    minv = matrix[i][j];
                    minIn = j;
                }
            }
            boolean isCheck = true;
            for(int j = 0; j< matrix.length; j++){
                if(matrix[i][minIn]<matrix[j][minIn]){
                    isCheck = false;
                    break;
                }
            }
            if(isCheck) arr.add(matrix[i][minIn]);
        }
        return arr;
    }
}
