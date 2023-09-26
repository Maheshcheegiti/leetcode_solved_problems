class Solution {
    public int xorOperation(int n, int start) {
        int xor = 0;
        for(int i = start; i<start+2*n;i+=2){
            xor^=i;
        }
        return xor;
    }
}
