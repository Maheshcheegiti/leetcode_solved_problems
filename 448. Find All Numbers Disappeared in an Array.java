class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int c = nums[i]-1;
            if(nums[i]!=nums[c]){
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(i = 0; i<nums.length; i++){
            if(nums[i]!=i+1) ans.add(i+1);
        }
        return ans;
    }
}
