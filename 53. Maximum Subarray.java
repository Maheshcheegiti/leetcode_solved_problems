class Solution {
    public int maxSubArray(int[] nums) {
        int maxS = Integer.MIN_VALUE, currS = 0;
        for(int i : nums){
            currS = Math.max(i, currS+i);
            maxS = Math.max(currS, maxS);
        }
        return maxS;
    }
}
