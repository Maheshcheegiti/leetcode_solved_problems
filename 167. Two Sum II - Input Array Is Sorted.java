class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s = 0, e = nums.length-1;
        while(nums[s]+nums[e]!=target){
            if(nums[s]+nums[e]>target) e--;
            else s++;
        }
        return new int[]{s+1,e+1};
    }
}
