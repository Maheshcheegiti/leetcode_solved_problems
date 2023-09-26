class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = (n*(n+1))/2;
        int exSum = 0;
        for(int i:nums){
            exSum+=i;
        }
        return actualSum-exSum;
    }
}
