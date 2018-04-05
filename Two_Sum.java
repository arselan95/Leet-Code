class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int a = 0,b = 0;
    	int t = 0;
        int[] arr=new int[2];
     for(int i=0;i<nums.length;i++)
     {
    	 for(int j=1;j<nums.length;j++){
    	  t=nums[i]+nums[j];
    	  if(t==target&& i!=j)
    	  {
    		 a=j;
    		 b=i;
    	  }
    	 }
     }
        
        if(a>b)
        {
            arr[0]=b;
            arr[1]=a;
        }
        else if(a<b)
        {
            arr[0]=a;
            arr[1]=b;
        }
        return arr;
        
        
        
    }
}