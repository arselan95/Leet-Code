class Solution {
    public String reverseString(String s) {
        
       /*
        String rev = "";
        char[] arr= s.toCharArray();
    	for(int i = s.length() - 1; i >= 0; i--)
         {
             rev = rev+ arr[i];
             
        }
    	 return rev;
         */
        String rev=" ";
        StringBuffer sb=new StringBuffer(s);
        rev=sb.reverse().toString();
        return rev;
       
    }
}