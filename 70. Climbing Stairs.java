class Solution {
    public int climbStairs(int n) {
        double a = (1+Math.sqrt(5))/2;
        double b = (1-Math.sqrt(5))/2;
        double c = (Math.pow(a,n+1)-Math.pow(b,n+1))/Math.sqrt(5);
        return (int)c;
    }
}
