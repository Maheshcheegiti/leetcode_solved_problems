class Solution {
    public String reversePrefix(String word, char ch) {
    
    String subString = word.substring(0,word.indexOf(ch)+1);
    StringBuilder sb = new StringBuilder(subString);
    return sb.reverse().append(word.substring(word.indexOf(ch)+1)).toString();
    
    }
}

// class Solution {
//     public String reversePrefix(String word, char ch) {
//         StringBuilder str = new StringBuilder();
//         int f = 0;
//         for(int i = 0; i<word.length();i++){
//             str.append(word.charAt(i));
//             if(word.charAt(i)==ch && f==0) {
//                 f =1;
//                 str = str.reverse();
//             }
//         }
//         return str.toString();
//     }
// }
