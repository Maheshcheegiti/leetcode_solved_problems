class Solution {
    // public int rob(int[] nums) {
    //     return  robhouse(nums,0);
    // }
    // public int robhouse(int[] nums,int s){
    //     if(s<0 || s>=nums.length) return 0;
    //     int left = nums[s]+robhouse(nums,s+2);
    //     int right = robhouse(nums,s+1);
    //     return Math.max(left,right); 
    // }
    // using dp 
    public int rob(int[] nums){
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int val1 = nums[0], val2 = Math.max(val1,nums[1]);
        for(int i = 2; i<n; i++){
            int temp = val2;
            val2 = Math.max(val2, nums[i]+val1);
            val1 = temp;
        }
        return val2;
    }
}
