class Solution {
    public boolean validMountainArray(int[] arr) {
        int i=0, n = arr.length, f= 0, g =0;
        // if(n==1) return false;
        while(i<n-1 && arr[i]<arr[i+1]){
            i++;
            f=1;
        }
        while(f==1 && i<n-1 && arr[i]>arr[i+1]){
            i++;
            g=1;
        }
        return i+1==n && g==1;
    }
}
