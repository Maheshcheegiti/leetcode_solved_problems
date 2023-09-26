class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for(int i=0; i<nums.length;i+=2){
            arrSize+=nums[i];
        }
        int[] res = new int[arrSize];
        int stdindx = 0;
        for(int i = 0;i<nums.length;i+=2){
            Arrays.fill(res,stdindx,stdindx+nums[i],nums[i+1]);
            stdindx += nums[i];
        }
        return res;
    }
}


// class Solution {
//     public int[] decompressRLElist(int[] nums) {
//         List<Integer> arr = new ArrayList<Integer>();
//         for(int i = 0; i<nums.length-1; i+=2){
//             for(int j =0; j<nums[i];j++){
//                 arr.add(nums[i+1]);
//             }
//         }
//         int[] res = new int[arr.size()];
//         int i = 0;
//         for(Integer num : arr){
//             res[i++]=num;
//         }
//         return res;
//     }
// }
