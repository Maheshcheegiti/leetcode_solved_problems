class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if(t.length()>n) return "";
        HashMap<Character, Integer> map =  new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int requiredCount = t.length(), i = 0, j = 0, start_i = 0, minWindowSize = Integer.MAX_VALUE;
        while(j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>0){
                requiredCount--;
            }
            map.put(ch, map.getOrDefault(ch, 0)-1);
            while(requiredCount == 0){
                int currentWindowSize = j-i+1;
                if(currentWindowSize<minWindowSize){
                    minWindowSize = currentWindowSize;
                    start_i = i;
                }
                char leftCh = s.charAt(i);
                map.put(leftCh, map.getOrDefault(leftCh, 0)+1);
                if(map.get(leftCh)>0){
                    requiredCount++;
                }
                i++;
            }
            j++;
        }
        if(minWindowSize==Integer.MAX_VALUE) return "";
        return s.substring(start_i,start_i+minWindowSize);
    }
}
