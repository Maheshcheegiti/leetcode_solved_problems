class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String s:word1){
            s1.append(s);
        }
        for(String s:word2){
            s2.append(s);
        }

        String a= s1.toString();
        String b= s2.toString();
        return a.equals(b);
    }
}

// class Solution {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         String str1 = String.join("",word1);
//         String str2 = String.join("",word2);
//         return str1.equals(str2);
//     }
// }

// class Solution {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         String str1 = "";
//         for(String i : word1){
//             str1+=i;
//         }
//         String str2 = "";
//         for(String i : word2){
//             str2+=i;
//         }
//         return str1.equals(str2);
//     }
// }
