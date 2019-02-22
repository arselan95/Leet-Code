import java.util.HashMap;

/*
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
 * 
 * Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
 */
public class MinWindowSubstring {
	/*
	 * if we wanna solve brute force, we iterate through s see if it contains all
	 * characters from t
	 * 
	 * 2nd time start 2nd character so basically iterate entire string for every
	 * character so time will be O(n^2)<- we DO NOT want this
	 * 
	 * substring problems- sliding window approach minium window substring with
	 * eyeball
	 */

	/*
	 * ex: ADOBECODEBANC ABC
	 * 
	 * so [ADOBEC]ODEBANC keep advancing windoe until it has all characters once all
	 * characters are in there we want to move the start point of window forward
	 * 
	 * we want to extend the frame until we have all characters in the frame
	 * A[DOBECODEBA]NC ADOBE[CODEBA]NC ADOBECODE[BANC]<<- BOOM
	 * 
	 * We also need to keep track of minimum length.
	 * 
	 * O(n)<- only iterating twice. once with head and once with tail
	 */

	public String minWindow(String s, String t) {

		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();

		// need hashmap to keep track of number of appearances
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		// we dont care abt frequencies of characters from s
		// we care about frequencies from t
		for (char temp : s1) {
			map.put(temp, 0);
		}
		// if it contains key we increase the instance of that character, bc that char
		// is from string t
		for (char temp : t1) {
			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else
				return "";
		}

		// start with sliding window
		int start = 0, end = 0, minLength = Integer.MAX_VALUE,
				// keep track if index- later we need to return string so we need to keep track
				// of index
				minStart = 0,
				// keep track of total number of char from shorter string
				numTargets = t.length();

		while (end < s.length()) {
			// we need to record the curr character that we iterate
			char curr = s.charAt(end);

			// check if this is one of the required char, if it is we will decrease the
			// target by 1
			// at the same time we update frequency of the char

			// this is one of required char
			if (map.get(curr) > 0) {
				numTargets--;
			}
			// we have already iterated through this char so update the map
			map.put(curr, map.get(curr) - 1);

			// if window satisfy the requirement (if it hhas all char)
			while (numTargets == 0) {
				// check if curr length is minimum length
				if (minLength > end - start + 1) {
					minLength = end - start + 1;
					minStart = start;
				}

				// determine if head is a required charcter, if it is required we need to update
				// the targets
				// we need to update frequency of this char(move tail forward)
				char head = s.charAt(start);
				// if frequency right now is
				if (map.get(head) >= 0) {
					numTargets++;
				}
				map.put(head, map.get(head) + 1);
				// update start
				start++;
			}
			// move end because rn we dont know if window has all characters
			end++;
		}
		// if minimun length = int.max-> return empty string
		// meaning mim length has not been touched
		// else return substring
		return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
	}

}
