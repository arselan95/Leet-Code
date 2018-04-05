class Solution {
    public int missingNumber(int[] nums) {
        
		int a=nums[0];
		int b=1;
		
		for(int i=1;i<nums.length;i++)
		{
			a=a^nums[i];
		}
		for(int i=2;i<nums.length+1;i++)
		{
			b=b^i;
		}
		return a^b;
    }
}