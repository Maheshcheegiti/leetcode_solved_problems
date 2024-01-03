class Solution {
    public int numberOfBeams(String[] bank) {
        int prevRowCount = 0;
        int totalCount = 0;
        int currentCount = 0;
        for(String i : bank){
            currentCount = calc(i);
            if(currentCount==0) continue;
            totalCount += prevRowCount*currentCount;
            prevRowCount = currentCount;
        }
        return totalCount;
    }
    public int calc(String s){
        int sum = 0;
        for(char ch : s.toCharArray()){
            sum += ch-'0';
        }
        return sum;
    }
}
