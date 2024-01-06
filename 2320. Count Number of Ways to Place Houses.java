class Solution {
    public int countHousePlacements(int N) {
        if(N==1) return 4;
        if(N==2) return 9;
        long a = 2, b =3, c = 0 ;
        int mod=1000000000+7;
        for(long i = 3; i<=N; i++){
            c = b;
            b = (a+b)%mod;
            a = c;
        }
        long ans = (b*b) % mod;
        return (int)ans;
    }
}
