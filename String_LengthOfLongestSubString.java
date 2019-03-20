import java.util.HashMap;
import java.util.HashSet;

/*
 * Longest Substring Without Repeating Characters
  Go to Discuss
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3.
 */
public class String_LengthOfLongestSubString {

	/*
	 * sliding window technique
	 * 
	 * two pointers to keep track of the string
	 */

	public int lengthOfLongestSubstring(String s) {

		if (s.length() == 0)
			return 0;

		int i = 0;
		int j = 0;
		int max = 0;
		HashSet<Character> set = new HashSet<>();
		/*
		 * use to a hashset to store values
		 */
		while (j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				max = Math.max(max, j - i);

			}

			else {
				set.remove(s.charAt(i));
				i++;

			}
		}
		return max;

	}

}
