class Solution {
    public int trap(int[] height) {
        int sum = 0, lmax =0, rmax = 0,i = 0 , j = height.length-1;
        while(i<=j){
            if(height[i]<=height[j]){
                if(height[i]>=lmax) lmax = height[i];
                else sum+=lmax-height[i];
                i++;
            }else{
                if(height[j]>=rmax) rmax = height[j];
                else sum+=rmax-height[j];
                j--;
            }
        }
        return sum;
    }
}
