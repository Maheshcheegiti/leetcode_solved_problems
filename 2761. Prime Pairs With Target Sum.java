class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean arr[] = new boolean[n];
        for(int i=2;i*i<=n;i++){
             if(arr[i]== false){
                 for(int j=i*i;j<n;j+=i){
                     arr[j] = true;
                 }
             }
        }
        for(int i=2;i<=n/2;i++){
            if(!arr[i] && !arr[n-i]){
                List<Integer> pair =  new ArrayList<>();
                pair.add(i);
                pair.add(n-i);
                ans.add(pair);
            }
        }
        return ans;
    }
}
