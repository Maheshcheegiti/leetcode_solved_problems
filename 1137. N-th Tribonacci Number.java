class Solution {
    public int tribonacci(int n) {
        if(n<2) return n;
        int a = 0;
        int b = 1;
        int c = 1;
        int i = 2;
        while(i<n){
            int t1 = c;
            c=a+b+c;
            int t2 = b;
            b = t1;
            a=t2;
            i++;
        }
        return c;
    }
}
