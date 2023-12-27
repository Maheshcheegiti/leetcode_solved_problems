class Solution {
    public int minCost(String colors, int[] neededTime) {
        int c = 0;
        int i = 0, j = 1;
        int len = colors.length();
        while(j<len){
            if(colors.charAt(i)==colors.charAt(j)){
                if(neededTime[i]<=neededTime[j]){
                    c += neededTime[i];
                    i = j ;
                    j++;
                }else{
                    c += neededTime[j];
                    j++;
                }
            }else{
                i=j; 
                j++;
            }
        }
        return c;
    }
}
