class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for(int[] person : logs){
            arr[person[0]-1950]++;
            arr[person[1]-1950]--;
        }
        int gsum = 0;
        int csum = 0;
        int year = 0;
        for(int i=0; i<101; i++){
            csum +=arr[i];
            if(gsum<csum){
                gsum = csum;
                year = i+1950;
            }
        }
        return year;
    }
}
