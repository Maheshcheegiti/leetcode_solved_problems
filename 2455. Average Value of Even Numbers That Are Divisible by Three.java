class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int c = 0;
        for(int i : nums){
            if(i%6==0){
                sum+=i;
                c++;
            }
        }
        return c==0?0:Math.round(sum/c);
    }
}
