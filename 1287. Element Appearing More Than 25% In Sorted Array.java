class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr) map.put(i, map.getOrDefault(i,0)+1);
        float n = arr.length;
        for(Integer i : map.keySet()){
            if((map.get(i)/n)>0.25) return i;
        }
        return -1;
    }
}
