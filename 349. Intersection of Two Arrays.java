class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1  = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums1) set1.add(i);
        for(int i : nums2) set2.add(i);
        set1.retainAll(set2);
        int[] ans = new int[set1.size()];
        int k = 0;
        for(Integer i : set1){
            ans[k++] = i;
        }
        return ans;
    }
}
