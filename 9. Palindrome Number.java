class Solution {
    public boolean isPalindrome(int original) {
        int reverseNum = 0;
        int tempOriginal = original;
        while (tempOriginal > 0) {
            int lastDigit = tempOriginal % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            tempOriginal = tempOriginal / 10;
        }
        if (original == reverseNum) {
          return true;
        } else {
          return false;
        }
    }
}


// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x<0) return false;
//         String str = String.valueOf(x);
//         StringBuilder org = new StringBuilder(str);
//         return str.equals(org.reverse().toString());
//     }
// }
