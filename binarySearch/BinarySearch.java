package binarySearch;

/*
 * i) Binary search is a searching algorithm which works with a sorted array.

ii) It works by comparing the middle element of the array with the search value. If it’s found, its position in the array is returned. If the search value is less than or greater than the middle element, the search continues in the lower or upper half of the array.

iii) The time complexity of the binary search.

a) Best case time complexity of binary search: O(1)

b) Worst case time complexity of binary search: O(logn)
 */

/*
 * arr = [11, 15, 16, 19, 25, 36, 67]
search element : 15

Step 1: Take two indexes low and high. The value of low is 0 and high is n-1. 
After that we have to calculate the value of mid.
low = 0,  high = 6
mid = (low + high)/2 = 3,   arr[3] is 19,   19 > 15 (19 is greater than 15)


Step 2:  Searching element < arr[mid], Search will resume in left half ( arr[low] to arr[mid-1])
low = 0, high = mid – 1 = 3 -1 = 2, high = 2
mid = (low + high ) / 2 = 1 , arr[1] is 15
So, the value we are searching is found at index 1.
 */

/*
 * low=0; high=size-1; search=x
 * 
 * while(low<=high)
 * {
 * mid=(low+high)/2
 * 
 * if(arr[mid]==x
 * {
 * return 
 * }
 * else if(x>arr[mid])
 * {
 * low=mid+1;
 * }
 * else if(x<arr[mid])
 * {
 * high=mid-1;
 * }
 * }
 * }
 */

public class BinarySearch {
	int binarySearch(int arr[], int low, int high, int x) {
		if (low <= high) {
			int mid = (low + high) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x) {
				high = mid - 1;
				return binarySearch(arr, low, high, x);
			} else {

				low = mid + 1;
				// Else the element can only be present
				// in right subarray
				return binarySearch(arr, low, high, x);
			}
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	// Driver method to test above
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
