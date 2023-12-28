class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder();
        int i = num1.length()-1, j = num2.length()-1,n = 0, c = 0;
        while(i>=0 && j>=0){
            n = num1.charAt(i)-'0' + num2.charAt(j)-'0' +c;
            ans.append(n%10);
            c = n/10;
            i--;
            j--;
        }
        while(i>=0){
            n = num1.charAt(i)-'0' +c;
            ans.append(n%10);
            c = n/10;
            i--;
        }
        while(j>=0){
            n = num2.charAt(j)-'0' +c;
            ans.append(n%10);
            c = n/10;
            j--;
        }
        
        if(c>0) ans.append(c);
        return ans.reverse().toString();
    }
}
