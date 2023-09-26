// class Solution {
//     public int fib(int n) {
//         if(n<2) return n;
//         return fib(n-1)+fib(n-2);
//     }
// }

class Solution {
    public int fib(int n) {
        if(n < 2)
            return n;
        int[] memo = new int[n + 1];
        memo[1] = 1;
        for(int i = 2; i <= n; i++)
        {
            memo[i] = memo[i - 1] + memo[i - 2];
        }        
        return memo[n];
    }
}
