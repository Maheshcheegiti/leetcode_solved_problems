class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
        for(char ch : word1.toCharArray()){
            fre1[ch-'a']++;
        }
        for(char ch : word2.toCharArray()){
            fre2[ch-'a']++;
        }

        for(int i = 0; i<26 ; i++){
            if((fre1[i]==0 && fre2[i]!=0) ||(fre1[i]!=0 && fre2[i]==0)) return false;
        }

        Arrays.sort(fre1);
        Arrays.sort(fre2);

        for(int i = 0; i<26; i++){
            if(fre1[i]!=fre2[i]) return false;
        }

        return true;
    }
}
