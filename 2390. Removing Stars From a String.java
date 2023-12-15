class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        int i =0;
        while(i< s.length()){
            char c = s.charAt(i);
            if(c=='*') st.pop();
            else st.push(c);
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
