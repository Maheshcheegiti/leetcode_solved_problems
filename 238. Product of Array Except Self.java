class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n  = nums.length;
        // int[] prefix = new int[n];
        // int[] suffix = new int[n];
        // int temp1 = 1, temp2= 1;
        // for(int i =  0; i< n; i++){
        //     prefix[i] = nums[i]*temp1;
        //     suffix[n-i-1] = nums[n-i-1]*temp2;
        //     temp1 = temp1 * nums[i];
        //     temp2 = temp2 * nums[n-i-1];
        // }
        // nums[0] = suffix[1];
        // nums[n-1] = prefix[n-2];
        // for(int i = 1; i<n-1; i++){
        //     nums[i] = prefix[i-1]*suffix[i+1];
        // }
        // return nums;
        int n = nums.length;
        int ans[] = new int[n];
        int prod = 1;
        for(int i = 0; i<n; i++){
            ans[i] = nums[i]*prod;
            prod*=nums[i];
        }
        prod = 1;
        for(int i = n-1; i>0; i--){
            ans[i] = ans[i-1]*prod;
            prod*=nums[i];
        }
        ans[0] = prod;
        return ans;
    }
}
