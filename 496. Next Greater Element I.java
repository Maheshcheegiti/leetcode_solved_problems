class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n2 = nums2.length;
        st.push(nums2[n2-1]);
        for(int i = n2-2; i>=0; i--){
            int t = nums2[i];
            while(!st.isEmpty() && st.peek()<=t){
                st.pop();
            }
            if(!st.isEmpty()) map.put(t, st.peek());
            st.push(t);
        }
        int ind = 0;
        for(int i : nums1){
            nums1[ind++] = map.getOrDefault(i, -1);
        }
        return nums1;
    }
}
