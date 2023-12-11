class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int i : nums){
            int len = (int)(Math.log10(i))+1;
            if(len%2==0) ans++;
        }
        return ans;
    }
}
