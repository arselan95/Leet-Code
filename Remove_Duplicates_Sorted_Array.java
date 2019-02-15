class Solution {
    
    /*
    
    Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

We check if consequtive values are equal as they are already sorted
if not equal we add it to new array/ or dynamic array in this case
    */
    public int removeDuplicates(int[] nums) {
        
        if(nums.length<2){
            return nums.length;
        }
        
        int j=0;
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i]!=nums[i+1])
                {
                    nums[j]=nums[i];
                    j++;
                }
               
            }
         nums[j++]=nums[nums.length-1];
        return j;
      
    }
}
