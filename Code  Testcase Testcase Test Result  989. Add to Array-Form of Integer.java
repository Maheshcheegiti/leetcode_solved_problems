class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int c = 0;
        for(int i = nums.length-1; i>=0;i--){
            int temp = nums[i]+(k%10)+c;
            arr.add(0,temp%10);
            c = temp/10;
            k/=10;
        }
        k = k+c;
        while(k>0){
            arr.add(0,k%10);
            k/=10;
        }
        return arr;
    }
}
