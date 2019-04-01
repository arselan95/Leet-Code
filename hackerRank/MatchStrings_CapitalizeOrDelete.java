package hackerRank;

/*
 * Check if it is possible to transform one string to another
Given two strings s1 and s2(call letters in uppercase). Check if it is possible to convert s1 to s2 by performing following operations.

1. Make some lowercase letters uppercase.
2. Delete all the lowercase letters.
 */
public class MatchStrings_CapitalizeOrDelete {

	/*
	 * Let DPi, j be 1 if it is possible to convert 1st i characters of s1 to j
	 * characters of s2, else DPi, j=0. Close observations gives us two conditions
	 * to deal with.
	 * 
	 * Initially DP0, 0=1, if DPi, j=1 then it is possible to check for next sets
	 * using following conditions. 1. If s1[i] in upper case is equal to s2[j] then
	 * it is possible to convert i+1 characters of s1 to j+1 characters of s2, hence
	 * DPi+1, j+1=1.
	 * 
	 * 2. If s1[i] is in lower case, then it is possible to delete that element and
	 * hence i+1 characters can be converted to j characters of s2. Hence DPi+1,
	 * j=1.
	 * 
	 * 
	 * 
	 * If DPn, m=1, then it is possible to convert s1 to s2 by following conditions.
	 */
	static String abbreviation(String a, String b) {
		if (helper(a, b)) {
			return "YES";
		}
		return "NO";

	}

	static boolean helper(String a, String b) {
		// length
		int lenA = a.length();
		int lenB = b.length();

		// bool array dynamic
		boolean arr[][] = new boolean[lenA + 1][lenB + 1];

		// mark everything false
		for (int i = 0; i <= lenA; i++) {
			for (int j = 0; j <= lenB; j++) {
				arr[i][j] = false;
			}
		}

		// mark first true
		arr[0][0] = true;

		// traverse for all strings

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j <= b.length(); j++) {
				/*
				 * if its possible to convert A to B
				 */
				if (arr[i][j]) {
					/*
					 * if uppercase letters are same
					 */
					if (j < lenB && (Character.toUpperCase(a.charAt(i)) == b.charAt(j)))
						arr[i + 1][j + 1] = true;

					/*
					 * if not same then delete letters from A
					 */
					if (!Character.isUpperCase(a.charAt(i)))

						arr[i + 1][j] = true;

				}
			}
		}
		return (arr[lenA][lenB]);
	}

}
