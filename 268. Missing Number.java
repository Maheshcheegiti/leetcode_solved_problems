class Solution {
    // public int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     int actualSum = (n*(n+1))/2;
    //     int exSum = 0;
    //     for(int i:nums){
    //         exSum+=i;
    //     }
    //     return actualSum-exSum;
    // }
    public int missingNumber(int[] nums){
        int i = 0;
        while(i<nums.length){
            int c = nums[i];
            if(c==nums.length){
                i++;
                continue;
            }
            if(nums[i]!=nums[c]){
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
            }else{
                i++;
            }
        }
        for(i = 0; i<nums.length;i++){
            if(nums[i]!= i) return i;
        }
        return nums.length;
    }
}
