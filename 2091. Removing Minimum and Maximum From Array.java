class Solution {
    public int minimumDeletions(int[] nums) {
        int gmin = Integer.MAX_VALUE, gindex = -1, gmax = Integer.MIN_VALUE, gmindex = -1;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i]<gmin){
                gmin = nums[i];
                gindex = i;
            }
            if(nums[i]>gmax){
                gmax = nums[i];
                gmindex = i;
            }
        }
        System.out.println(gindex+" "+gmindex+" "+nums.length);
        int num1 = Math.max(gindex+1, gmindex+1);
        int num2 = Math.max(nums.length-gindex, nums.length-gmindex);
        int num3 = Math.min(gindex+1, gmindex+1)+Math.min(nums.length-gindex, nums.length-gmindex);
        return Math.min(Math.min(num1,num2),num3);
    }
}
