class Solution {
    public boolean isPerfectSquare(int num) {
        int sq = (int)Math.sqrt(num);
        return (sq*sq)==(num);
    }
}
