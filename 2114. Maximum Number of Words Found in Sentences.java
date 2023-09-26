class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String i:sentences){
            String[] words = i.split(" ",0);
            if(words.length>max) max = words.length;
        }
        return max;
    }
}
