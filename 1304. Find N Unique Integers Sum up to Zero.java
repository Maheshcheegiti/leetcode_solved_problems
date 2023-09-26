class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int k = 0;
        for(int i = -n/2;i<=n/2;i++){
            if(n%2==0 && i==0) continue;
            arr[k++] = i;
        }
        return arr;
    }
}
