class Solution {
    public int[] relativeSortArray(int[] A1, int[] A2) {
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : A1) map.put(i, map.getOrDefault(i,0)+1);
        
        int[] ans = new int[A1.length];
        int ind =0;
        for(int i :A2){
            if(map.containsKey(i)){
                for(int j = 0; j<map.get(i); j++){
                    ans[ind++] = i;
                }
                map.remove(i);
            }
        }
        
        ArrayList<Integer> remains = new ArrayList<>();
        for(Integer i : map.keySet()){
            for(int j=0;j<map.get(i);j++){
                remains.add(i);
            }
        }
        Collections.sort(remains);
        for(int i=0;i<remains.size();i++){
            ans[ind++] = remains.get(i);
        }
        return ans;
    }
}
