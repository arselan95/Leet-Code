import java.util.ArrayList;
import java.util.List;

/*
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.



Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LetterCombinations {
	/*
	 * method combine is to add new letters to old list, using 2 for-loop.
	 * 
	 * for example:
	 * 
	 * gave digits = "23"
	 * 
	 * i=0 -> result=combine("abc", [""]) ---> [a,b,c];
	 * 
	 * i=1 -> result=combine("def", [a,b,c]) ---> [ad,bd,cd, ae,be,ce, af,bf,cf];
	 */

	public static List<String> letterCombinations(String digits) {
		String digitletter[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		List<String> result = new ArrayList<String>();

		if (digits.length() == 0)
			return result;

		result.add("");
		for (int i = 0; i < digits.length(); i++)
			result = combine(digitletter[digits.charAt(i) - '0'], result);

		return result;
	}

	public static List<String> combine(String digit, List<String> l) {
		List<String> result = new ArrayList<String>();

		for (int i = 0; i < digit.length(); i++)
			for (String x : l)
				result.add(x + digit.charAt(i));

		return result;
	}
/*
 * public List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) return ans;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		for(int i =0; i<digits.length();i++){
			int x = Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length()==i){
				String t = ans.remove();
				for(char s : mapping[x].toCharArray())
					ans.add(t+s);
			}
		}
		return ans;
	}
 */
}
