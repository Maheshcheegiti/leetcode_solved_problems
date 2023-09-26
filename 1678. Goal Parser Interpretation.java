class Solution {
    public String interpret(String command) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            {
                s.append('G');
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                  s.append('o');
                  i+=1;
            }
            else
            {
                s.append('a');
                s.append('l');
                i=i+3;
            }
        }
      return s.toString();
    }
}

// class Solution {
//     public String interpret(String command) {
//         return command.replace("()","o").replace("(al)","al");
//     }
// }
