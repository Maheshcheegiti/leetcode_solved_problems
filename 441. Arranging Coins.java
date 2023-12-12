class Solution {
    public int arrangeCoins(int n) {
        int s = 0, e = n;
        while(s<=e){
            int mid = s+(e-s)/2;
            long val = ((long)mid*(mid+1))/2;
            if(val==n) return mid;
            if(val>n){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return e;
    }
}
