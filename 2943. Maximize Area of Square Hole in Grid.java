class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int c1 =1, c2 = 1, max1 = 1 , max2 =1;
        for(int i = 0; i<hBars.length-1; i++){
            if(hBars[i+1]-hBars[i]==1) {
                c1++;
                max1 = Math.max(max1,c1);
            }
            else {

                c1 = 1;
            }
        }
        for(int i = 0; i<vBars.length-1; i++){
            if(vBars[i+1]-vBars[i]==1) {
                c2++;
                max2 = Math.max(max2,c2);
            }
            else {
                c2 =1;
            }
        }
        // System.out.println(max1+" "+max2);
        int min = Math.min(max1, max2)+1;
        return min*min;
    }
}
