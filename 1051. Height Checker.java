class Solution {
    public int heightChecker(int[] heights) {
        int[] arr = new int[101];
        for(int i = 0;i<heights.length;i++){
            arr[heights[i]]++;
        }
        int currHeight = 0;
        int res = 0;
        for(int i = 0; i<heights.length;i++){
            while(arr[currHeight]==0){
                currHeight++;
            }
            if (currHeight != heights[i]) {
                res++;
            }
            arr[currHeight]--;
        }
        return res;
    }
}    
