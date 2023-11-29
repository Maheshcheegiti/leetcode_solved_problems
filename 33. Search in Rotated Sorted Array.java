class Solution {
    public int search(int[] nums, int target) {
        int pivot = rotatedIndex(nums);
        System.out.println(pivot);
        int ans = binarySearch(nums, 0, pivot, target);
        if(ans==-1){
            ans = binarySearch(nums,pivot+1,nums.length-1,target);
        }
        return ans;
    }
    public int rotatedIndex(int[] nums){
        int s = 0, e = nums.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(mid<e && nums[mid]>nums[mid+1]) return mid;
            if(mid>s && nums[mid]<nums[mid-1]) return mid-1;
            if(nums[s]>=nums[mid]){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return nums.length-1;
    }
    public int binarySearch(int[] nums, int s, int e, int target){
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return -1;
    }
}
