class Solution {
    public boolean binarySearch(int[][] matrix, int r, int tar){
        int start = 0;
        int end = matrix[r].length-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(matrix[r][mid]==tar) return true;
            else if(matrix[r][mid]>tar){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return false;
    }
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     int r1 = 0;
    //     int r2 = matrix.length-1;
    //     while(r1<=r2){
    //         int rm = (r1+r2)/2;
    //         if(matrix[rm][0]>target){
    //             if(binarySearch(matrix,rm,target)) return true;
    //             r2 = rm - 1;
    //         }else if(matrix[rm][0]==target) return true;
    //         else{
    //             if(binarySearch(matrix,rm,target)) return true;
    //             r1 = rm+1;
    //         }
    //     }
    //     return false;
    // }
    public boolean searchMatrix(int[][] matrix, int target) {
        int r1 = 0;
        int r2 = matrix.length-1;
        while(r1<=r2){
            int rm = (r1+r2)/2;
            if(matrix[rm][0]>target){
                r2 = rm-1;
            }else if(matrix[rm][0]==target) return true;
            else{
                r1 = rm+1;
            }
        }
        if(r2>=0 && binarySearch(matrix,r2,target)) return true;
        return false;
    }
}
