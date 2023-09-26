class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c = 0;
        for(String i: operations){
            if(i.equals("--X") || i.equals("X--")) c--;
            else c++;
        }
        return c;
    }
}
