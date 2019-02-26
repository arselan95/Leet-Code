import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Find Kth Most recurring String
 * O(NlogN)
 * 
 * use hashmap to calculate frequencies 
 * later sort this by frequency  and get our value
 * liner time to calculate all frequencies
 * or use hashtree- n log n 
 */
public class String_KthMostRecurringString {

	public String KthMostFrequent(String[] strings, int k) {
		// hashmap to store the frequency
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// now go through list of string and calculate frequency of each one
		for (String s : strings) {
			Integer x = map.get(s);
			if (x == null)
				x = 0;
			map.put(s, ++x); // ++x bc we want to increment before we add it
		}

		// map entry has key and value
		// its one entry in hashmap basically
		// advantage is now we have both values so i can sort this list of key and of
		// map entry objects
		// and i can create custom comparator that would just compare values easily
		List<Map.Entry> list = new ArrayList(map.entrySet());

		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				Integer v1 = (Integer) ((Map.Entry) o1).getValue();
				Integer v2 = (Integer) ((Map.Entry) o2).getValue();
				return v1.compareTo(v2);
			}
		});

		// now we get our valur from this list
		// So now we have a sorted array list
		if (list.size() > k)
			return (String) (list.get(k)).getKey();
		return null;

	}

}
