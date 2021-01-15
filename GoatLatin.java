import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.
 
If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
 
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin. 

 

Example 1:

Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 */

public class GoatLatin {
	public String toGoatLatin(String S) {
		Set<Character> vowel = new HashSet<>(Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));
		StringBuilder sb = new StringBuilder();
		String[] words = S.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (i != 0)
				sb.append(" ");

			String word = words[i];
			if (vowel.contains(word.charAt(0))) {
				sb.append(word).append("ma");
			} else {
				sb.append(word.substring(1)).append(word.charAt(0)).append("ma");
			}

			for (int j = 0; j <= i; j++)
				sb.append('a');
		}
		return sb.toString();
	}

}

// older viesion 

/*

class Solution {
    public String toGoatLatin(String S) {
        
        
        //from string to array of string
        String[] sentence =  S.split("\\s+");
        
       //list for vowels
        ArrayList<Character> vowels = new ArrayList <Character>();
        
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        //our algorithm
        for(int i =0; i<sentence.length;i++)
        {
                
            if(vowels.contains(sentence[i].charAt(0)))
               {
                   sentence[i]=sentence[i].concat("ma");
               }
               
               else
               {
                   char first = sentence[i].charAt(0); 
                   sentence[i]= sentence[i].substring(1,sentence[i].length()).concat(first+"ma");
               }
        
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j <= i; j++) {
	                builder.append("a");
	            }
            String result = builder.toString();
            sentence[i]=sentence[i].concat(result);
                
    }
        
        // update and return new translated String
    
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < sentence.length; i++) 
        {
         sb.append(sentence[i]+" ");
        }
        String str = sb.toString();
        
        return str.substring(0,str.length()-1);
}
}

*/
