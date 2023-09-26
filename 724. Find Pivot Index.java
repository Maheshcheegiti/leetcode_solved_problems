class Solution {
    public int pivotIndex(int[] nums) {
        int lsum = 0;
        int rsum = 0;
        for(int i : nums) rsum+=i;
        for(int i = 0;i<nums.length;i++){
            if(lsum == rsum-lsum-nums[i]) return i;
            lsum += nums[i];
        }
        return -1;
    }
}
