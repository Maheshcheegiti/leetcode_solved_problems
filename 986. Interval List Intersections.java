class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> ans = new ArrayList<>();
        int i = 0, j = 0 , n1 = firstList.length, n2 = secondList.length;
        while(i<n1 && j<n2){
            int left = Math.max(firstList[i][0],secondList[j][0]);
            int right = Math.min(firstList[i][1],secondList[j][1]);
            if(left<=right) ans.add(new int[]{left, right});
            if(firstList[i][1] < secondList[j][1]){
                i++;
            }else{
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
