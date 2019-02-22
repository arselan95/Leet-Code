import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/*
 * Given two arrays, write a function to compute their intersection.
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Each element in the result must be unique.
The result can be in any order.
 */
public class IntersectionOfTwoArrays_SET_INTERSECTION {

	public int[] intersection(int[] nums1, int[] nums2) {

		  List<Integer> set = new ArrayList<Integer>();
		  
		  //sort bthe arrays
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        
	        //if an element is common add that to the list else just move on
	        int i = 0;
	        int j = 0;
	        while (i < nums1.length && j < nums2.length) {
	            if (nums1[i] < nums2[j]) {
	                i++;
	            } else if (nums1[i] > nums2[j]) {
	                j++;
	            } else {
	                if(set.contains(nums1[i]))
	                {
	                    i++;
	                }
	                else{
	                set.add(nums1[i]);
	                i++;
	                j++;
	                }
	            }
	        }
	        //move elements of array bck to the list 
	        int[] result = new int[set.size()];
	        int k = 0;
	        for (Integer num : set) {
	            result[k++] = num;
	        }
	        return result;
	        

	}

}
