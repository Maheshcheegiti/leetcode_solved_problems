class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] arr = new int[n*n];
        int ind = 0;
        for(int[] row : matrix){
            for(int i : row){
                arr[ind++] = i;
            }
        }
        
        Arrays.sort(arr);
        return arr[k-1];
    }
}
