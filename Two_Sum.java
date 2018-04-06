 class Solution {
	
	public static void twosum(int[] nums,int target) 
    {
		int[] res=new int[2];
		HashMap<Integer,Integer>h1=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			int diff= target-nums[i];
			if(h1.containsKey(diff))
			{
				res[0]=h1.get(diff);
				res[1]=i;
				for(int k:res){
				System.out.println(k);
				}
			}
			else{
				h1.put(nums[i],i);
			}
		}	
    	
    }
    
    public static void main(String[] args)
    {
    	int[] a={1,3,4,5};
    	twosum(a,5);
    	
    	
    			
    
    }

}
