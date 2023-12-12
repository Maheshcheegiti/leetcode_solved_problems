import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        spiral(matrix, ans, 0, matrix.length - 1, 0, matrix[0].length - 1);
        return ans;
    }

    public void spiral(int[][] mat, ArrayList<Integer> ans, int r1, int r2, int c1, int c2) {
        if (r1 > r2 || c1 > c2) {
            return;
        }
        for (int i = c1; i <= c2; i++) {
            ans.add(mat[r1][i]);
        }
        for (int i = r1 + 1; i <= r2; i++) {
            ans.add(mat[i][c2]);
        }
        if (r1 < r2) {
            for (int i = c2 - 1; i >= c1; i--) {
                ans.add(mat[r2][i]);
            }
        }
        if (c1 < c2) {
            for (int i = r2 - 1; i > r1; i--) {
                ans.add(mat[i][c1]);
            }
        }
        spiral(mat, ans, r1 + 1, r2 - 1, c1 + 1, c2 - 1);
    }
}
