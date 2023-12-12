class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s = 0, e = arr.length;
        while(s<e){
            int m = s+(e-s)/2;
            if((arr[m]-m-1)<k){
                s = m +1 ;
            }else{
                e = m;
            }
        }
        return s+k;
    }
}
