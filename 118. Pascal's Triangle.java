class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        res.add(row);

        for(int i = 1; i<numRows ; i++){
            row = new ArrayList<>();
            row.add(1);
            for(int j =0; j<i-1 ; j++){
                row.add(res.get(i-1).get(j)+res.get(i-1).get(j+1));
            }
            row.add(1);
            res.add(row);
        }
        return res;
    }
}
