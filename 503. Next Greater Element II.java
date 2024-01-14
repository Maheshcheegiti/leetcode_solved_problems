class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        st.push(nums[n-1]);
        for(int i = 2*(n-1); i>=0 ; i--){
            int t = nums[i%n];
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    nums[i] = -1;
                }else{
                    nums[i] = st.peek();
                }
            }
            st.push(t);
        }
        return nums;
    }
}
