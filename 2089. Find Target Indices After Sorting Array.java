class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lCount = 0;
        int eCount = 0;
        for(int i : nums){
            if(i<target) lCount++;
            else if(i==target) eCount++;
        }
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<eCount;i++){
            arr.add(lCount++);
        }
        return arr;
    }
}
