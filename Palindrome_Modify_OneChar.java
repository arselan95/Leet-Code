/*
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
 */
public class Palindrome_Modify_OneChar {
	/*
	 * Follow normal way (two pointers) to check if s is palindrome. When two chars
	 * are not equal, try to skip (pseudo delete) either left one or right one and
	 * continue checking.
	 */

	/*
	 * BRUTE FORCE The most naive approach would be:
	 * 
	 * Remove every element once and apply isPalindrome() every time. If any time
	 * you find that its palindrome then return true If you reach end of sting then
	 * return false The worst part for this type of solution is that the string
	 * length can be 50000 (see question). So remove each element means it will run
	 * O(50000) and each isPalindrome is O(N) making it O(50000N)
	 * 
	 * OPTIMIZED Just maintain 2 pointers i.e for start and end of string Keep
	 * checking if they are same
	 * 
	 * If they are Same - then just check inside and keep going till you reach the
	 * center(left==right)(if odd string) or left>right (if even string) If they are
	 * NOT same : You now have 2 options 2.1) Remove Left Element and Check for the
	 * Rest of String OR 2.2) Remove Right Element and Check for the Rest of the
	 * string. If either of them dont give palindrome then its not a palindorme.
	 */
	public boolean validPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j && s.charAt(i) == s.charAt(j)) {
			i++;
			j--;
		}

		if (i >= j)
			return true;

		if (isPalin(s, i + 1, j) || isPalin(s, i, j - 1))
			return true;
		return false;
	}

	private boolean isPalin(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else
				return false;
		}
		return true;
	}

}
