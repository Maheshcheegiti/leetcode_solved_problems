class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        for(int i : nums) sum+=i;
        int leftSum = 0;
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            temp = nums[i];
            nums[i] = Math.abs(sum - leftSum-nums[i]);
            leftSum+=temp;
            sum-=temp;
        }
        return nums;
    }
}
