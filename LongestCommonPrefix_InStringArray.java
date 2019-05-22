/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix_InStringArray {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		if (strs.length == 1)
			return strs[0];
		String commonPrefix = strs[0];
		for (int i = 0; i < strs.length; i++) {
			commonPrefix = findCommonPrefix(commonPrefix, strs[i]);
		}
		return commonPrefix;
	}

	private String findCommonPrefix(String s1, String s2) {
		StringBuffer sb = new StringBuffer();
		int i = 0;
		while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
			sb.append(s1.charAt(i++));
		}
		return sb.toString();
	}

}
