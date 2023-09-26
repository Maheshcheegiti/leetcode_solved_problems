class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String i : arr){
            StringBuilder temp = new StringBuilder(i);
            res.append(temp.reverse().append(" "));
        }
        return res.toString().trim();
    }
}
