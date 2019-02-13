
public class LiscenseKeyFormat {
	/*
	 * Given a number K, we would want to reformat 
	 * the strings such that each group contains 
	 * exactly K characters, except for the first group 
	 * which could be shorter than K, but still must contain 
	 * at least one character. Furthermore, there must be a 
	 * dash inserted between two groups and all lowercase letters 
	 * should be converted to uppercase.
	 * Input: S = "5F3Z-2e-9-w", K = 4

Output: "5F3Z-2E9W"

Explanation: The string S has been split into two parts, each part has 4 characters.
Note that the two extra dashes are not needed and can be removed.
	 */
	
	
public String licenseKeyFormatting(String S, int K) {
	/*
	 * problem to find the remainder of string - in reverse
	 *5 mod 2(whick is K) so remainder is 1
	 *we can start from end of string and concatinate char 
	 *and reverse entire string
	 *
	 *  stringbuilder is fast because we want to concatinate
	 *  start from end of string
	 *  
	 */
	
	StringBuilder sb=new StringBuilder();
	int length= S.length();
	//k is temp var to keep track of current group that we are iterating
	
	for(int i =length-1 ,k=K; i>=0;i--)
	{
		char ch =S.charAt(i);
		//if cur char is not a - we want to append it
		if(ch !='-')
		{
			//check if have we reached length limit of current group
			//if k=0 
			//append letter first
			//check if we have reached the length before we append
			//make sense if we check first
			//if reach length limit then append
			
			if(k==0)
			{
				sb.append("-");
				k=K;
			}
			//result is going to append this character
			//once we reach end we will have first group as it is
			sb.append(ch);
			k--;
		}
	}
	return sb.reverse().toString();
        
    }

}
