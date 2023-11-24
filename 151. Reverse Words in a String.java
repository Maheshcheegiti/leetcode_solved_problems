class Solution {
    public String reverseWords(String s) {
       String sr[] = s.trim().split("\\s+");
       String rev = "";
       for(String i : sr){
           System.out.println(i.strip());
           rev = i.trim()+" "+rev;
       } 
       return rev.trim();
    }
}
