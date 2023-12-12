class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>  map1 = new HashMap<>();
        for(int i : nums1) map1.put(i, map1.getOrDefault(i,0)+1);
        ArrayList<Integer> arr = new ArrayList<>(); 
        for(int i : nums2){
            if(map1.containsKey(i) && map1.get(i)>0) {
                arr.add(i);
                map1.put(i,map1.get(i)-1);
            }
        }
        int[] ans = new int[arr.size()];
        for(int i = 0; i< arr.size(); i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
