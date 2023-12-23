class Solution {
    public boolean isPathCrossing(String path) {
        HashMap<Character, Pair<Integer,Integer>> moves = new HashMap<>();
        moves.put('N', new Pair(0,1));
        moves.put('E', new Pair(1,0));
        moves.put('W', new Pair(-1,0));
        moves.put('S', new Pair(0,-1));
        HashSet<Pair<Integer, Integer>> visited = new HashSet<>();
        visited.add(new Pair(0,0));
        int x = 0, y = 0;
        for(Character c : path.toCharArray()){
            Pair<Integer, Integer> t  = moves.get(c);
            int xadd = t.getKey();
            int yadd = t.getValue();
            x+=xadd;
            y+=yadd;
            Pair<Integer, Integer> pair = new Pair(x,y);
            if(!visited.add(pair)) return true;
        }
        return false;
    }
}
