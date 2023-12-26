class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch) && ch!=' ') str.append(ch);
        }
        String org = str.toString().toLowerCase();
        String rev = str.reverse().toString();
        rev = rev.toLowerCase();
        System.out.println(org+" "+rev);
        return org.equals(rev);
    }
}
