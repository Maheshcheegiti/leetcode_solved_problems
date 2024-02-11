public class Solution {
    private String t;

    private int check(int l, int r, int ans) {
        while (l >= 0 && r < t.length()) {
            if (t.charAt(l--) == t.charAt(r++))
                ans++;
            else
                break;
        }
        return ans;
    }

    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        t = s;
        for (int i = 0; i < n; i++) {
            ans += check(i, i, 0);    // odd length palindromes
            ans += check(i, i + 1, 0); // even length palindromes
        }
        return ans;
    }
}
