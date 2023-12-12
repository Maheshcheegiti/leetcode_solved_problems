class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, m = nums1.length, n = nums2.length;
        int[] arr = new int[m+n];
        int k = 0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }
        while(i<m){
            arr[k++] = nums1[i++];
        }
        while(j<n){
            arr[k++] = nums2[j++];
        }
        int len = arr.length;
        if(len%2==1){
            return arr[len/2]/1.0;
        }
        return (arr[len/2]+arr[(len/2)-1])/2.0;
    }
}
