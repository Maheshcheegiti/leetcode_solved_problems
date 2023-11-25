class Solution {
    public boolean checkString(String s) {
        int f = 0, g=0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                if(g>0) return false;
                f++;
            }
            else if(s.charAt(i)=='b'){
                g++;
            }
        }
        if(g>0 || f==0 || g==0) return true;
        return false;
    }
}
