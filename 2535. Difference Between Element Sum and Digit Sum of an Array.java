class Solution {
    public int digitSum(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digSum = 0;
        for( int i : nums){
            eleSum += i;
            digSum += digitSum(i);
        }
        return Math.abs(eleSum-digSum);
    }
}
