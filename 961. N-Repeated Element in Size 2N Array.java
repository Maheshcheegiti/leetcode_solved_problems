class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<(nums.length)/2+2;i++){
            if(!(map.containsKey(nums[i]))){
                map.put(nums[i],1);
            }else{
                return nums[i];
            }
        }
        return -1;
    }
}
