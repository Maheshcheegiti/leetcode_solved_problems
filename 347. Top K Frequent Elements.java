class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list based on values in descending order
        entryList.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int c = 0;
        for (Map.Entry<Integer, Integer> entry : entryList) {
            if(c==k) return arr;
            arr[c++] = entry.getKey(); 
        }
        return arr;
    }
}
