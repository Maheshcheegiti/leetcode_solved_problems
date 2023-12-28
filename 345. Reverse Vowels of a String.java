class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length()-1;
        StringBuilder str = new StringBuilder(s);
        while(i<j){
            if(!isVowel(s.charAt(i))){
                i++;
            }
            else if(!isVowel(s.charAt(j))){
                j--;
            }else{
                str.setCharAt(i,s.charAt(j));
                str.setCharAt(j,s.charAt(i));
                i++;
                j--;
            }
        }
        return str.toString();
    }

    public boolean isVowel(char ch){
        String str = "aeiouAEIOU"; 
        return (str.indexOf(ch) != -1) ? true : false;
    }
}
