class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a = coordinates.charAt(0) - 'b';
        int b = coordinates.charAt(1);
        return (a+b)%2!=0;
    }
}
