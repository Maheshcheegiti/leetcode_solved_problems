class Solution {
    public boolean backspaceCompare(String s, String t) {
        s = convertString(s);
        t = convertString(t);
        System.out.println(s+" "+t);
        return s.equals(t);
    }
    public String convertString(String str){
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch=='#') {
                if(!st.isEmpty()) st.pop();
            }
            else st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
