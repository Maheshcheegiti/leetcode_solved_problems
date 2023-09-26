class Solution {
    public String truncateSentence(String s, int k) {
       for(int i = 0; i<s.length();i++){
           if(s.charAt(i)==' ') k--;
           if(k==0) return s.substring(0,i);
       }
       return s;
    }
}

// class Solution {
//     public String truncateSentence(String s, int k) {
//         String[] arr = s.split(" ");
//         StringBuilder str = new StringBuilder();
//         for(int i = 0; i<k;i++){
//             str.append(arr[i]+" ");
//         }
//         return str.toString().trim();
//     }
// }
