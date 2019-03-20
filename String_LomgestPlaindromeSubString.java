
/*
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
 */
public class String_LomgestPlaindromeSubString {

	/*
	 * dynamic programming
	 * 
	 */

	public String longestPalindrome(String s) {

		/*
		 * define two dimension boolean variable bool[i][j]->if palindromic or not?
		 * 
		 * s.charat(i)==s.charat(j)
		 * 
		 * then use the bool variable[i+1][j-1]
		 * 
		 * we need longest of j-1
		 */

		int length = s.length();

		if (s == null || length < 2)
			return s;

		// dynamic programming technique by introducing two dimension boolean array
		boolean[][] isPlaindrome = new boolean[length][length];

		// pointers
		int left = 0;
		int right = 0;

		for (int j = 1; j < length; j++) {
			for (int i = 0; i < j; i++) {
				// isPlaindrome or if there is only one single character
				boolean isInnerPlaindrome = isPlaindrome[i + 1][j - 1] || j - i <= 2;

				if (s.charAt(i) == s.charAt(j) && isInnerPlaindrome) {
					// is palindrome
					isPlaindrome[i][j] = true;

					// update longest palindrominc start and end index
					if (j - i > right - left) {
						left = i;
						right = j;
					}
				}

			}
		}
		// longest substring
		// left is inclusive right is excluisve so +1
		return s.substring(left, right + 1);

	}

}
