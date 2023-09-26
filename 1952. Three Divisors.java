class Solution {
    public boolean isThree(int n) {
        int c = 2;
        for(int i = 2;i<n;i++){
            if(n%i==0) c++;
            else if(c>3) return false;
        }
        return c==3?true:false;
    }
}
