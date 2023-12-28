class Solution {
    public int compress(char[] chars) {
        int index = 0, i= 0, c = 0, n = chars.length;
        char currchar = 'a';
        while(i<n){
            c = 0; 
            currchar = chars[i];
            while(i<n && chars[i]==currchar){
                i++;
                c++;
            }
            chars[index++] = currchar;
            if(c>1){
                for(char ch : Integer.toString(c).toCharArray()){
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }
}
