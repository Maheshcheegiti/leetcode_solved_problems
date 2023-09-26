class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        int[] arr = new int[26];
        for(char s : allowed.toCharArray()){
            arr[s-'a'] = 1;
        }
        for(String s : words){
            for(char c : s.toCharArray()){
                if(arr[c-'a']!=1){
                    n--;
                    break;
                }
            }
        }
        return n;
    }
}
// class Solution {
//     public int countConsistentStrings(String allowed, String[] words) {
//         int c = words.length;
//         for(String j:words){
//             for(int i =0; i<j.length();i++){
//                 if(allowed.indexOf(j.charAt(i))==-1){ 
//                     c--; 
//                     break;   
//                 }
//             }
//         }
//         return c;
//     }
// }
