class Solution {
    public int countCharacters(String[] words, String chars) {
        int c = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< chars.length(); i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        for(String st : words){
            int wc = 0;
            HashMap<Character, Integer> temp = new HashMap<>(map);
            for(int  i = 0 ; i<st.length();i++){
                char ch = st.charAt(i);
                if(temp.containsKey(ch) && temp.get(ch)>0){
                    wc += 1;
                    System.out.println(ch+" "+temp.get(ch));
                    temp.put(ch,temp.get(ch)-1);
                }else{
                    wc = 0;
                    break;
                }
            }
            c+=wc;
        }
        return c;
    }
}
