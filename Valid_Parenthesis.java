class Solution {
    
    public static boolean ispair(char open, char close)
    {
        if(open== '(' && close== ')')
        {
            return true;
        }
        if(open=='{' && close== '}')
        {
            return true;
        }
        if(open =='[' && close== ']')
        {
            return true;
        }
        return false;
    }
    
    
    public boolean isValid(String s) {
        char[] d=s.toCharArray();
        
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<d.length;i++)
        {
            if(d[i]=='(' || d[i]=='{' || d[i]=='[')
            {
                st.push(d[i]);
            }
            else if(d[i]==')' || d[i]=='}' || d[i]==']')
            {
                if(st.empty() || !ispair(st.pop(),d[i]))
                {
                    return false;
                }
            }
        }
        if (st.isEmpty())
         return true; 
       else
         {   
             return false;
         } 
        
    }
}