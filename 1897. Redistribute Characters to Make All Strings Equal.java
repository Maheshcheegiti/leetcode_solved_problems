class Solution {
    public boolean makeEqual(String[] words) {
        int[] fre = new int[26];
        for(String i : words){
            for(char ch : i.toCharArray()){
                fre[ch-'a']++;
            }
        }
        int n = words.length;
        for(int i : fre){
            if(i%n!=0) return false; 
        }
        return true;
    }
}
