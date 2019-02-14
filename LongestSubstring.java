import java.util.HashMap;
/*
 * Given a string, find the length of the longest substring T that contains at most k distinct characters.
 * Input: s = "eceba", k = 2
Output: 3
Explanation: T is "ece" which its length is 3
 */

public class LongestSubstring {

	/*
	 * make a char array maintain a hashmap where we track the number of unique
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
	public static int length(String s, int k) {
		// start and end var in window
		// they will give us longest substring with k unique char

		// window size = end - start +1

		// also maintain longest substring that we find till now
		// till now mean-> till pointer has traversed along char array so we do not lose
		// it

		int start = 0, end = 0, windowSize = 1,
				// update this in the end with start which would give us longest substring
				windowStart = 0;
		int size = s.length();
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		//if string is empty or k =0 
		if(s.isEmpty()|| k==0)
		{
			return 0;
		}
		//if string just has one char
        if(s.length()==1)
        {
            return 1;
        }
		int ch = (int) s.charAt(0);
		hash.put(ch, 1);

		for (int i = 1; i < size; i++) {
			ch = (int) s.charAt(i);
			if (!hash.containsKey(ch)) {
				hash.put(ch, 1);
			} else {
				int temp = hash.get(ch);
				hash.put(ch, ++temp);
			}
			end++;
			// move start forward if number of unique characters is greater than m
			while (!isLessThanM(hash, k)) {
				int temp = hash.get((int) s.charAt(start));
				hash.put((int) s.charAt(start), --temp);
				start++;
			}
			if (end - start + 1 > windowSize) {
				windowSize = end - start + 1;
				windowStart = start;
			}
		}
		return s.substring(windowStart, windowStart + windowSize).length();

	}

	public static boolean isLessThanM(HashMap<Integer, Integer> hash, Integer m) {
		int count = 0;
		for (Integer key : hash.keySet())
			if (hash.get(key) > 0)
				count++;

		return (count <= m);
	}
	
	public static void main(String[] args)
	{
		length("a",0);
	}

}
