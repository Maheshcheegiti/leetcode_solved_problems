/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeakElement(mountainArr);
        int ans = binarySearch(mountainArr, 0, peakIndex, target);
        if(ans == -1){
            ans = rbinarySearch(mountainArr,peakIndex+1, mountainArr.length()-1, target);
        }
        return ans;
    }
    public int findPeakElement(MountainArray nums) {
        int s = 0, e = nums.length()-1;
        while(s<e){
            int mid = (s+e)/2;
            if(nums.get(mid)>nums.get(mid+1)){
                e = mid;
            }else{
                s = mid + 1;
            }
        }
        return s;
    }
    public int binarySearch(MountainArray nums, int s , int e, int target){
        while(s<=e){
            int mid = (s+e)/2;
            if(nums.get(mid)==target) return mid;
            else if(nums.get(mid)>target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return -1;
    }
    public int rbinarySearch(MountainArray nums, int s , int e, int target){
        while(s<=e){
            int mid = (s+e)/2;
            if(nums.get(mid)==target) return mid;
            else if(nums.get(mid)<target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return -1;
    }
}
