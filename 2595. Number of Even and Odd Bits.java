class Solution {
    public int[] evenOddBit(int n) {
        int e = 0,o = 0,c=0;
        while(n!=0){
            if(n%2==1){
                if(c%2==0) e++;
                else o++;
            }
            c++;
            n/=2;
        }
        return new int[]{e,o};
    }
}
