class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}
// another solution
class Solution {
    public int mySqrt(int x) {
        int l = 1;
        int r = (int)Math.sqrt(x);
        while(l <= r){
            int mid = l+(r-l)/2;
            if(x / mid == mid){
                return mid;
            } else if(mid > x / mid){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
