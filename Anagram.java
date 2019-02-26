
public class Anagram {
	
	public boolean isAnagram(String s1, String s2)
	{
		//check for length first
		if(s1.length()!=s2.length())return false;
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		//256 because we assume that string is in reasonable characters
		int[] letters= new int[256]; //or use 1<<8 1 shifted over 8
		
		for(char c: s1.toCharArray())
		{
			//going through the array
			//using the index because the character is basically a byte
			//its interchangable with byte primitive type in java
			letters[c]++;
		}
		
		for(char c:s2.toCharArray())
		{
			letters[c]--;
		}
		for(int i:letters)
		{
			if(i!=0) return false;
		}
		return true;
		
		
		
	}

}
