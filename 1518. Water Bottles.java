class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int r = 0;
        while(numBottles>=numExchange){
            int temp = numBottles/numExchange;
            int rem = numBottles%numExchange;
            sum+= temp;
            numBottles = temp + rem;
        }
        return sum;
    }
}
