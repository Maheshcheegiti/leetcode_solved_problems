class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // Arrays.sort(target);
        // Arrays.sort(arr);
        // return Arrays.equals(target,arr);
        int[] fre = new int[1001];
        for(int i : target) fre[i]++;
        for(int j : arr) fre[j]--;
        for(int i : fre){
            if(i!=0) return false;
        }
        return true;
    }
}
