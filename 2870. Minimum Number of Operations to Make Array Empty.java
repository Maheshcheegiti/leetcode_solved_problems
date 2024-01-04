class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);
        int c = 0;
        for(Integer key : map.keySet()){
            int v = map.get(key);
            if(v==1) return -1;
            c+=(v+2)/3;
        }
        return c;
    }
}
