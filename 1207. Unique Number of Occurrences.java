class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(!(map.containsKey((i)))){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        HashMap<Integer,Integer> cmap = new HashMap<>();
        for(int i : map.keySet()){
            if(!(cmap.containsKey(map.get(i)))){
                cmap.put(map.get(i),1);
            }else{
                return false;
            }
        }
        return true;
    }
}
