class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, g = 0;
        for(int i: nums){
            if(i==1){
                c++;
            }else{
                g = Math.max(c,g);
                c=0;
            }
        }
        g = Math.max(c,g);
        return g;
    }
}
