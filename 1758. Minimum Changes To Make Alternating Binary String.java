class Solution {
    public int minOperations(String s) {
        int  c = 0;
        for(int i = 0; i<s.length(); i++){
            if(i%2==0 && s.charAt(i)=='1') c++;
            else if(i%2==1 && s.charAt(i)=='0') c++;
        }
        return Math.min(c, s.length()-c);
    }
}
