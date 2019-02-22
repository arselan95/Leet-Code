import java.util.HashMap;

public class firstUniqueString {
	/*
	 * Given a string, find the first non-repeating character in it and return it's
	 * index. If it doesn't exist, return -1.
	 */

	/*
	 * s = "leetcode" return 0.
	 */
	/*
	 * /* make a string array maintain a hashmap where we track the number of unique
	 * characters as we go along the input string
	 * 
	 * Hashmap will contain the character and corresponding count to the character
	 * in the substring that we r looking at
	 * 
	 * a pointer to traverse through char array window based approach to traveese
	 * though char array and find longest substring with k unique char
	 * 
	 * 
	 */

	public static int unique(String s) {

		/*
		 * break the string turn each line into array
		 *
		 * count to hold count to hold count of each one of the char in this string
		 * 
		 * Hashmap takes in a string and int because hashmap is used to implement an
		 * assosiative array associaciate each characters within this string with a
		 * specific value
		 *
		 * So each char in the string is linked to a count of how many times a specific
		 * char occurs
		 * 
		 */

		if (s.isEmpty())
			return -1;

		String arr[] = s.split("");

		int count = 0;
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();

		/*
		 * check and see if the hashmap of a particular char is empty
		 * 
		 */
		for (int i = 0; i < arr.length; i++) {

			// current letter
			String curr = arr[i];

			// check to see if curr letter that is being looked at
			// exists in the hashmap

			// if not then ad it.
			if (!h1.containsKey(curr)) {
				// add current letter and add count to the current letter
				h1.put(curr, 1);
				// count = 1;
			} else {
				// if current letter already in hashmap then increment the count
				// update the count
				count = h1.get(curr);
				h1.put(curr, count + 1);
			}
		}

		// get index of first non repeated letter
		for (int i = 0; i < arr.length; i++) {
			String k = arr[i];

			if (h1.get(k) == 1) {
				System.out.print(k);
				return s.indexOf(k);

			}

		}
		return -1;

	}

	public static void main(String[] args) {
		String s = "AABCABBADCEFGHGC﻿";
		unique(s);
	}

}
