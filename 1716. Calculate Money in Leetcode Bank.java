class Solution {
    public int totalMoney(int n) {
        int weeks = n/7;
        int total = 28*weeks+((weeks*(weeks-1)*7)/2);
        int r = n%7;
        total += r*(weeks+1)+((r*(r-1))/2);
        return total;
    }
}
