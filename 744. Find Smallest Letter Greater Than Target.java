class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(letters[mid]>target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        if(s>letters.length-1) return letters[0];
        return letters[s];
    }
}
