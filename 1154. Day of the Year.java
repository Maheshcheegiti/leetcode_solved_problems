class Solution {
    public int dayOfYear(String date) {
        String str[] = date.split("-");
        int y = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]), d = Integer.parseInt(str[2]);
        int[] months = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i = 0; i<m-1; i++){
            if(i==1 && isLeap(y)){
                d += months[i]+1;
            }else{
                d += months[i];
            }
        }
        return d;
    }
    public boolean isLeap(int y){
        if(y%400==0) return true;
        else if(y%100==0) return false;
        else if(y%4==0) return true;
        return false; 
    }
}
