
/*
 * //A program to find the sum of contiguous subarray within a  
 * one-dimensional array of numbers which has the largest sum. //{-2, 3, 3, -1, -2, 1, 5, -3} //{2, 3, 4, 1, 2, 1, 5, 3}
 */
public class SubArraySun_ContagiousSubarray {

	int maxSubSum(int[] nums) {
		   if(nums== null || nums.length ==0)
		      return 0;
		   int subSum=nums[0], maxSum=nums[0];
		   for(int i = 0; i < nums.length; i++) {
		      subSum = Math.max(nums[i], subSum + nums[i]);
		      maxSum = Math.max(subSum, maxSum);
		  }
		  return maxSum;
		}

}
