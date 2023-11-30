class Solution {
    public int maxArea(int[] height) {
        int s = 0, e = height.length-1, maxarea = 0;
        while(s<e){
            int currarea = Math.min(height[s],height[e])*(e-s);
            maxarea = Math.max(currarea,maxarea);
            if(height[s]<height[e]){
                s++;
            }else{
                e--;
            }
        }
        return maxarea;
    }
}
