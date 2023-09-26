class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        int k = 0;
        for(int i:nums){
            result[k++]=i;
        }
        for(int i:nums){
            result[k++]=i;
        }
        return result;
    }
}
