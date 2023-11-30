class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int c = nums[i]-1;
            if(nums[i]!=nums[c]){
                int t = nums[c];
                nums[c] = nums[i];
                nums[i] = t;
            }else{
                i++;
            }
        }
        int[] ans = new int[2];
        for(i =0; i<nums.length; i++){
            if(nums[i]!=i+1){
                ans[0] = nums[i];
                ans[1] = i+1;
                return ans;
            }
        }
        return ans;
    }
}
