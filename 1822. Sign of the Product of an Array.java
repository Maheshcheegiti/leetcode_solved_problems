class Solution {
    public int arraySign(int[] nums) {
        int c = 0;
        for(int i : nums){
            if(i==0) return 0;
            else if(i<0) c++;
        }
        if(c%2==0) return 1;
        return -1;
    }
}
