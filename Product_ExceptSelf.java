
/*
 * Given an array nums of n integers where n > 1,  
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

//do it without division
Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
 */
public class Product_ExceptSelf {
	// Use tmp to store temporary multiply result by two directions. Then fill it
	// into result

	public int[] productExceptSelf(int[] nums) {

		int[] result = new int[nums.length];
		for (int i = 0, tmp = 1; i < nums.length; i++) {
			result[i] = tmp;
			tmp *= nums[i];
		}
		for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
			result[i] *= tmp;
			tmp *= nums[i];
		}
		return result;

	}
	/*
	 * with division
	 * public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int nonZeroProd = 1;
        int zeroCount = 0;
        for(int i = 0; i<nums.length; i++){
            prod *= nums[i];
            if(nums[i] != 0)
                nonZeroProd *= nums[i];
            else
                zeroCount++;
        }    
        
        int[] result = new int[nums.length];
        if(zeroCount>1) return result;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0)
                result[i] = prod/nums[i];
            else
                result[i] = nonZeroProd;
        }
        
        return result;
    }
	 */
}
