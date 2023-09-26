class Solution {
    public String firstPalindrome(String[] words) {
        for(String i : words){
            StringBuilder ans = new StringBuilder(i);
            ans = ans.reverse();
            if(i.equals(ans.toString())) return i;
        }
        return "";
    }
}
