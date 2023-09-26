class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c = stones.length();
        int[] arr = new int[58];
        for(char i: jewels.toCharArray()){
            arr[i-'A']=1;
        }
        for(char j: stones.toCharArray()){
            if(arr[j-'A']!=1) c--;
        }
        return c;
    }
}
