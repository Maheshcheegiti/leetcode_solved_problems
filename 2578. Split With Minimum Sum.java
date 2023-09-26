class Solution {
    public int splitNum(int num) {
        List<Integer> arr = new ArrayList<>();
        while(num>0){
            arr.add(num%10);
            num/=10;
        }
        Collections.sort(arr);
        int a = 0;
        int b = 0;
        for(int i = 0; i<arr.size()-1;i++){
            a = a*10+arr.get(i++);
            b = b*10+arr.get(i);
        }
        if(arr.size()%2==1) a = a*10+arr.get(arr.size()-1);
        return a+b;
    }
}
