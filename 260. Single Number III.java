class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i,0)+1);
        int[] ans = new int[2];
        int k = 0;
        for(Integer j : map.keySet()){
            if(map.get(j)==1) ans[k++] = j;
        }
        return ans;
    }
}
