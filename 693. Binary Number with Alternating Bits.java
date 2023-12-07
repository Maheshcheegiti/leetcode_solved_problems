class Solution {
    public boolean hasAlternatingBits(int n) {
        int temp = 1;
        if((n&1)==1) temp = 0;
        while(n!=0){
            if(n%2==temp) return false;
            temp = n%2;
            n/=2;
        }
        return true;
    }
}
