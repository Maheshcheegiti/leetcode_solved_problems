class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, minSize = Integer.MAX_VALUE, sum = 0, n = nums.length;
        while(i<n){
            sum += nums[i];
            while(sum>=target){
                minSize = Math.min(minSize, i-j+1);
                sum -= nums[j++];
            }
            i++;
        }
        return (minSize==Integer.MAX_VALUE)?  0 : minSize;
    }
}
