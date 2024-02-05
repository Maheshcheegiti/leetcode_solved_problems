class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastIndex = new int[26];
        int n = s.length();
        for(int i = 0; i<n ; i++){
            lastIndex[s.charAt(i)-'a'] = i;
        }
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i<n){
            char ch = s.charAt(i);
            int li = lastIndex[ch-'a'];
            int j = i;
            while(j<li){
                int newLi = lastIndex[s.charAt(j)-'a'];
                if(newLi>li) li = newLi;
                j++;
            }
            ans.add(j-i+1);
            i = j+1;
        }
        return ans;
    }
}
