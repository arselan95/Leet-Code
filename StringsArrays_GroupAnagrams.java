import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 */
public class StringsArrays_GroupAnagrams {

	public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {

		// if array is empty
		if (strs == null || strs.length == 0)
			return new ArrayList<ArrayList<String>>();

		// use map to check for combinations
		/*
		 * This checks if the sorted string which is the map key is present in the map.
		 * If it is not present, i.e. the first time we have encountered this sorted
		 * string then insert that in the map with value of empty array list.
		 */

		/*
		 * for example,map didn't have the List [nat,tan,ant] and it came across
		 * "nat",map will add a new ArrayList with a keyStr "ant";
		 */
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);

			// get the string after sorting the char array
			String keyStr = String.valueOf(ca);

			if (!map.containsKey(keyStr))
				map.put(keyStr, new ArrayList<String>());
			map.get(keyStr).add(s);
		}
		return new ArrayList<ArrayList<String>>(map.values());

	}

	public static void main(String[] args) {
		String arr[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		groupAnagrams(arr);

	}

}
