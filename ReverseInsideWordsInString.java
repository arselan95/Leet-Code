/*
 * Given a string, you need to reverse the order of characters in each word within a 
 * sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseInsideWordsInString {
	
	/*
	 *  Step 1. Convert the string to char[] array
		Step 2. Whenever I encounter a space ' ' , I call the reverse function ( just to keep the code clean )
		Step 3. Repeat till the end!
	 */
	public String reverseWords(String s) {
		char[] s1 = s.toCharArray();
		int i = 0;
		for (int j = 0; j < s1.length; j++) {
			if (s1[j] == ' ') {
				reverse(s1, i, j - 1);
				i = j + 1;
			}
		}
		reverse(s1, i, s1.length - 1);
		return new String(s1);
	}

	public void reverse(char[] s, int l, int r) {
		while (l < r) {
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
	}

}
