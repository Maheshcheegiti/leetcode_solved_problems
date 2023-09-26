class Solution {
    public int alternateDigitSum(int n) {
        String anss = String.valueOf(n);
        int sign = 1;
        int sum = 0;
        for(char c : anss.toCharArray()){
            sum += sign*Character.getNumericValue(c);
            sign*=-1;
        }
        return sum;
    }
}
