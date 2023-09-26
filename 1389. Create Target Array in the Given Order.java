class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
        }
        int k =0;
        for(Integer i: arr) nums[k++] = i;
        return nums;
    }
}
