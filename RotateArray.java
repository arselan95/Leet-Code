/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */
public class RotateArray {
	public void rotate(int[] nums, int k) {
		/*
		 * it can reduce rotate times. for example: nums = [1,2,3,4,5] ， nums.length =
		 * 5; k = 6 ---> nums = [5,1,2,3,4] nums = [1,2,3,4,5] ， nums.length = 5; k = 1
		 * ---> nums = [5,1,2,3,4] k % nums.length = 1; we can reduce rotate times after
		 * " k %= nums.length;"
		 */
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	/*
	 * nums = "----->-->"; k =3 result = "-->----->";
	 * 
	 * reverse "----->-->" we can get "<--<-----" reverse "<--" we can get
	 * "--><-----" reverse "<-----" we can get "-->----->"
	 */
	public void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
