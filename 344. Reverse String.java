class Solution {
    public void reverseString(char[] s) {
        char temp = 'a';
        
        int n = s.length;
        if (n < 2) return;
        for (int i = 0; i < (n / 2); i++) {
            temp = s[i];
            s[i] = s[n - i - 1];    
            s[n - i - 1] = temp;
        }
        return;
    }
}
