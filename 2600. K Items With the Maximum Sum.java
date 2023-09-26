class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        return Math.min(k, numOnes) - Math.max(0, k - numOnes - numZeros);
    }
}
// class Solution {
//     public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
//         int a = Math.min(numOnes,k);
//         int b = Math.min(numZeros,k-a);
//         int c = Math.min(numNegOnes,k-a-b);
//         return a-c;
//     }
// }
