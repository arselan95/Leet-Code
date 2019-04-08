import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Given a string, we can "shift" each of its letter to its successive letter, for example: "abc" -> "bcd". 
 * We can keep "shifting" which forms the sequence:

"abc" -> "bcd" -> ... -> "xyz"
Given a list of strings which contains only lowercase alphabets, group all strings that belong to the same shifting sequence.

Example:

Input: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"],
Output: 
[
  ["abc","bcd","xyz"],
  ["az","ba"],
  ["acef"],
  ["a","z"]
]
 */
public class GroupShiftedStrings_HashMap {

	public List<List<String>> groupStrings(String[] strings) {

		List<List<String>> res = new ArrayList<List<String>>();
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (String s : strings) 
		{
			String key = "";
			for (int i = 1; i < s.length(); i++) 
			{
				int diff = s.charAt(i) - s.charAt(i - 1);
				if (diff < 0) {
					diff += 26;
				}
				
				key += diff;
				
			}

			if (!map.containsKey(key))
			{
				map.put(key, new ArrayList<String>());
			}
			
			map.get(key).add(s);
			
		}

		for (String key : map.keySet()) {
			res.add(map.get(key));
		}
		return res;

	}

}
