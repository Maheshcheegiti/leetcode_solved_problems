class Solution {
    public int countDigits(int num) {
        int temp = num;
        int c = 0;
        while(num>0){
            if(temp%(num%10)==0) c++;
            num/=10;
        }
        return c;
    }
}
