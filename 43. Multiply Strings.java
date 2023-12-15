class Solution {
    public String multiply(String num1, String num2) {
        java.math.BigInteger a = new java.math.BigInteger(num1);
        java.math.BigInteger b = new java.math.BigInteger(num2);
        return a.multiply(b).toString();
    }
}
