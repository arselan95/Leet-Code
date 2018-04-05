class Solution {
    public int strStr(String haystack, String needle) {
    
        
		if(haystack.contains(needle)){
            if(needle.isEmpty() && haystack.isEmpty())
			{
				return 0;
			}
            if(needle.isEmpty() && haystack!=null)
			{
				return 0;
			}
            if(needle.isEmpty()||haystack.isEmpty())
			{
				return -1;
			}
            
            else{
			
			  int g= haystack.indexOf(needle,0);
			  return g;
            }
		}
		
        else{
		return -1;
        }
		  
    }
}