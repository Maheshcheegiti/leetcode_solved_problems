class Solution {
    public int firstMissingPositive(int[] nums) {
         int i = 0;
         while(i<nums.length){
             int c = nums[i]-1;
             if(c>=0 && c<nums.length && nums[i]!=nums[c]){
                 int t = nums[i];
                 nums[i] = nums[c];
                 nums[c] = t;
             }else{
                 i++;
             }
         }
         for(i=0;i<nums.length;i++){
             if(nums[i]!=i+1) return i+1;
         }
         return nums.length+1;
    }
}
