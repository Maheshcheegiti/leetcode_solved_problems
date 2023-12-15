class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set  = new HashSet<>();
        for(List<String> s : paths){
            set.add(s.get(1));
        }
        for(List<String> s : paths){
            set.remove(s.get(0));
        }
        for(String i : set){
            return i;
        }
        return "";
        // return set.iterator().next();
    }
}
