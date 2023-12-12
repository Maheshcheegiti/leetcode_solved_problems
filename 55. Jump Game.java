class Solution {
    public boolean canJump(int[] nums) {
        int flag = nums.length-1;
        for(int i = flag-1; i>=0; i--){
            if(i+nums[i]>=flag) flag = i;
        }
        return flag==0;
    }
}
