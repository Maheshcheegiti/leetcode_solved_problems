class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :nums) map.put(i, map.getOrDefault(i,0)+1);
        int count = 0;
        for(int num : map.keySet()){
            if(map.containsKey(num+k)){
                if(map.get(num)==1 && k==0 ){
                    continue;
                }else{
                    count++;
                }
            }
        }
        return count;
    }
}
