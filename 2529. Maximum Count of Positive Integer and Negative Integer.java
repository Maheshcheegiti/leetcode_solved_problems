class Solution {
    public int maximumCount(int[] nums) {
        int start = 0, end = nums.length;
        while(start<end){
            int mid = start + (end - start)/2;
            if(nums[mid]<0){
                start = mid + 1;
            }else{
                end = mid ;
            }
        }
        // System.out.println(start);
        int pos = nums.length - start;
        int i = start;
        while(i<nums.length && nums[i] == 0){
            pos -- ;
            i++;
        }
         // System.out.println(pos);
        return start > pos? start : pos;
    }
}
