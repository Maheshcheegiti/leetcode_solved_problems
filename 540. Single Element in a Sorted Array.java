class Solution {
    // public int singleNonDuplicate(int[] nums) {
    //     int  x = 0;
    //     for(int i : nums){
    //         x^=i;
    //     }
    //     return x;
    // }
    public int singleNonDuplicate(int[] nums) {
        int s = 0, e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            System.out.println(s+" "+e+" "+mid);
            if(mid<e && nums[mid]==nums[mid+1] && mid%2!=0){
                e = mid - 1;
            }else if(mid>0 && nums[mid]==nums[mid-1] && (mid-1)%2!=0){
                e = mid - 2;
            }else if(mid<e && nums[mid]==nums[mid+1] && mid%2==0){
                s = mid + 2;
            }else if(mid>0 && nums[mid]==nums[mid-1] && (mid-1)%2==0){
                s =  mid + 1;
            }else{
                return nums[mid];
            }
        }
        return nums[s];
    }
}
