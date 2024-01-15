class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> lostmap = new HashMap<>();
        for(int item[]  : matches){
            lostmap.put(item[1], lostmap.getOrDefault(item[1],0)+1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> winners = new HashSet<Integer>();
        HashSet<Integer> lostonce = new HashSet<Integer>();

        for(int item[] : matches){
            if(!lostmap.containsKey(item[0])){
                winners.add(item[0]);
            }
            if(lostmap.containsKey(item[1]) && lostmap.get(item[1])==1) lostonce.add(item[1]);
        }
        List<Integer> win = new ArrayList<>(winners);
        List<Integer> lost = new ArrayList<>(lostonce);
        Collections.sort(win);
        Collections.sort(lost);
        ans.add(win);
        ans.add(lost);
        return ans;
    }
}
