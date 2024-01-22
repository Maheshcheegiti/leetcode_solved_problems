class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> start = new HashMap<>();
        int max = 1, size =1, n = nums.length;
        for(int i = 0; i<n ; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(!start.containsKey(nums[i])){
                start.put(nums[i],i);
            }
            if(max<map.get(nums[i])){
                max = map.get(nums[i]);
                size = i-start.get(nums[i])+1;
            }
            else if(max==map.get(nums[i])){
                size = Math.min(size, i-start.get(nums[i])+1);
            }
        }
        return size;
    }
}
