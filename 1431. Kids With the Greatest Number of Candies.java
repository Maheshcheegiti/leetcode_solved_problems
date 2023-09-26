class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> arr = new ArrayList<>();
        for(int i: candies){
            if(i>max) max = i;
        }
        for(int i:candies){
            if(i+extraCandies>=max) arr.add(true);
            else arr.add(false);
        }
        return arr;
    }
}
