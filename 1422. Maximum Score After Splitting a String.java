class Solution {
    public int maxScore(String s) {
        int left =0, right =0, max = Integer.MIN_VALUE, n = s.length();
       for(int i = 0; i<n; i++){
           if(s.charAt(i)=='0') left++;
           else right++;
           if(i!=n-1) max = Math.max(max, left-right);
       }
       return max+right;
    }
}
