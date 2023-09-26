class Solution {
    public int countAsterisks(String s) {
        int bars = 0;
        int c = 0;
        for(char ch : s.toCharArray()){
            if( ch=='*' && bars%2==0) c++;
            else if (ch=='|') bars++;
        }
        return c;
    }
}
