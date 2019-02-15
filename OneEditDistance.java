
public class OneEditDistance {

	/*
	 * Given two strings s and t, determine if they are both one edit distance
	 * apart.
	 * 
	 * Note:
	 * 
	 * There are 3 possiblities to satisify one edit distance apart:
	 * 
	 * Insert a character into s to get t Delete a character from s to get t Replace
	 * a character of s to get t
	 * 
	 * 
	 * Input: s = "ab", t = "acb" Output: true Explanation: We can insert 'c' into s
	 * to get t.
	 */

	public boolean isOneEditDistance(String s, String t) {
		/*
		 * Let the input strings be s and t and lengths of input strings be s1 and t1
		 * respectively.
		 * 
		 * 1) If difference between s1 an t1 is more than 1, return false. 
		 * 2) Initialize
		 * count of edits as 0. 
		 * 3) Start traversing both strings from first character.
		 * 
		 * a) If current characters don't match, then 
		 * (i) Increment count of edits 
		 * (ii) If count becomes more than 1, return false 
		 * (iii) If length of one string is more, then only possible edit is to remove a character. 
		 * 		Therefore, move ahead in larger string. 
		 * (iv) If length is same, then only possible edit is to
		 * change a character. Therefore, move ahead in both strings. 
		 * 
		 * b) Else, move ahead in both strings.
		 */

		// length of string
		int s1 = s.length();
		int t1 = t.length();

		// edit count
		int count = 0;

		// if no edit is required
		if (s.equals(t)) {
			return true;
		}

		// if diff of length is more than 1, strings can't be at one
		// distance

		if (Math.abs(s1 - t1) > 1)
			return false;

		// traverse through strings
		int i = 0, j = 0;
		while (i < s1 && j < t1) {
			if (s.charAt(i) != t.charAt(j)) {
				if (count == 1)
					return false;

				// if length of one string is more we can
				// remove a char
				if (s1 > t1)
					i++;

				else if (s1 < t1)
					j++;

				else {
					i++;
					j++;
				}
				count++;
			} else {
				// if strings match
				i++;
				j++;
			}
		}

		// if last char is extra
		if (i < s1 || j < t1) {
			count++;
		}
		return count == 1;
	}

}
