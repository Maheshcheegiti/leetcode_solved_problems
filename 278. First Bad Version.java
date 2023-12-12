/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 0, e = n-1;
        int ans = 0;
        while(s<=e){
            int mid = s+(e-s)/2;
            System.out.println(s+" "+e+" "+mid);
            if(isBadVersion(mid+1)){
                e = mid-1;
                ans = mid+1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
}
