class Solution {
    public String removeOuterParentheses(String s) {
        int c = 0;
        int f = 0;
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch=='(') c++;
            else c--;
            if(c==1 && f==0){
                continue;
            }
            else if(c==0){
                f=0;
                continue;
            }else{
                f=1;
                str.append(ch);
            }
        }
        return str.toString();
    }
}
