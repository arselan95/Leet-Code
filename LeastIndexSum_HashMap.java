import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. 
If there is a choice tie between answers, output all of them with no order requirement. 
You could assume there always exists an answer.

Example 1:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".


Example 2:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
 */
public class LeastIndexSum_HashMap {


	public String[] findRestaurant(String[] list1, String[] list2) {
		List<String> result = null;
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < list1.length; i++) {
			map1.put(list1[i], i);
		}
		for (int i = 0; i < list2.length; i++) {
			map2.put(list2[i], i);
		}

		for (int i = 0; i < list1.length; i++) {
			if (map2.containsKey(list1[i])) {
				int sum = map1.get(list1[i]) + map2.get(list1[i]);
				if (sum < min)
				{
					min = sum;
					result = new ArrayList<String>();
					result.add(list1[i]);
				} 
				else if (sum == min) 
				{
					result.add(list1[i]);
				}
			}
		}

		String[] res = new String[result.size()];
		for (int i = 0; i < result.size(); i++) {
			res[i] = result.get(i);
		}

		return res;

	}

}
