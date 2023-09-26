class Solution {
    public boolean selfDividing(int n){
        int temp =n;
        while(n>0){
            int rem = n%10;
            if(rem==0) { return false;}
            else if(temp%rem!=0) return false;
            n/=10; 
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ar = new ArrayList<>();
        for(int i= left ; i<=right;i++){
            if(selfDividing(i)) ar.add(i);
        }
        return ar;
    }
}
