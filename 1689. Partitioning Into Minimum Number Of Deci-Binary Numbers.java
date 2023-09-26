class Solution {
    public int minPartitions(String n) {
        if (n.indexOf("9") >= 0) return 9;
        else if (n.indexOf("8") >= 0) return 8;
        else if (n.indexOf("7") >= 0) return 7;
        else if (n.indexOf("6") >= 0) return 6;
        else if (n.indexOf("5") >= 0) return 5;
        else if (n.indexOf("4") >= 0) return 4;
        else if (n.indexOf("3") >= 0) return 3;
        else if (n.indexOf("2") >= 0) return 2;
        else return 1;
    }
}
// class Solution {
//     public int minPartitions(String n) {
//         char[] c  = n.toCharArray();
//         int max = Integer.MIN_VALUE;
//         for(char ch : c){
//             int a = Character.getNumericValue(ch);
//             if(a>max) max = a;
//         }
//         return max;
//     }
// }
