class Solution {
    public String largestGoodInteger(String num) {
        int gmax = Integer.MIN_VALUE;
        int cmax = Integer.MIN_VALUE;
        String ans = "";
        for(int i = 0; i<num.length()-2; i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                String cmaxs = num.substring(i,i+3);
                cmax =  Integer.parseInt(cmaxs);
                if(cmax>gmax){
                    gmax = cmax;
                    ans = cmaxs;
                }
            } 
        }
        return ans;
    }
}
