import java.util.HashMap;
import java.util.HashSet;

/*
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer is unique.

Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.

 

Example:

Input: 
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
Output: "ball"
 */
public class String_MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {

		// split paragraph
		String[] words = paragraph.toLowerCase().split("\\W+");

		// add banned words to a set
		HashSet<String> set = new HashSet<String>();
		for (String word : banned) {
			set.add(word);
		}

		// add paragraph to map
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String word : words) {
			if (!set.contains(word)) {
				map.put(word, map.getOrDefault(word, 0) + 1);
			}
		}

		// get most frequent word
		int max = 0;
		String res = "";
		for (String str : map.keySet()) {
			if (map.get(str) > max) {
				max = map.get(str);
				res = str;
			}
		}
		return res;

	}

}
