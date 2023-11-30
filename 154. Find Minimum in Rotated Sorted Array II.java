class Solution {
    public int findMin(int[] nums) {
        int s = 0, e = nums.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(mid<e && nums[mid]>nums[mid+1]) return nums[mid+1];
            if(mid>s && nums[mid]<nums[mid-1]) return nums[mid];
            if(nums[s]==nums[mid] && nums[e]==nums[mid]){
                if(s<e && nums[s]>nums[s+1]) return nums[s+1];
                s++;
                if(s<e && nums[s]<nums[s-1]) return nums[s];
                e--;
            }
            else if(nums[s]<nums[mid] || (nums[s]==nums[mid] && nums[mid]>nums[e])){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return nums[0];
    }
}
