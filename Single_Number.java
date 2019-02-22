class Solution {
    /*
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Input: [2,2,1]
Output: 1

xor 
0 0 0
0 1 1
1 0 1
1 1 0
    */
    public int singleNumber(int[] nums) {
        
        int result= nums[0];
        for(int i=1;i<nums.length;i++)
        {
            //returns true only if number of true inputs is odd
            result=result ^ nums[i];
        }
        return result;
    }
}
