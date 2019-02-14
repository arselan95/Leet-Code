class Solution {
    public void moveZeroes(int[] nums) {
        /*
        Traverse the given array ‘arr’ 
        from left to right. While traversing, maintain count of non-zero elements in array. 
        Let the count be ‘count’. For every non-zero element arr[i], put the element at ‘arr[count]’ and increment ‘count’. 
        After complete traversal, all non-zero elements have already been shifted to front end and ‘count’ is set as index of first 0. 
        Now all we need to do is that run a loop which makes all elements zero from ‘count’ till end of the array.
        O(n) where n is number of elements in input array.
        */
        
 int count=0;
      for(int i =0;i<nums.length;i++)
      {
    	  if(nums[i]!=0)
    	  {
    		  nums[count++]=nums[i];
    	  }
      }
      while(count<nums.length){
    	  nums[count++]=0;
      }
        
        
    }
}
