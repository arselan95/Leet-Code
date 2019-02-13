
public class PlusOne {
	/*
	 * add 1 to the array and return the number as an new array
	 */
	/*
	 * iterate backwards
	 * edge case is 9 when we have to resize array
	 * if 9 set that index to 0 and continue
	 * if not then just increment the last index
	 */
	
	public int[] plusone(int[] digits)
	{
		for(int i = digits.length-1;i>=0;i--)
		{
			if(digits[i]<9)
			{
				digits[i]++;
				return digits;
			}
			//if 9 then set it to 0 
			digits[i]=0;
		}
		
		/*
		 * make new array to return result
		 * we make array +1 size of original digit array 
		 */
		int[] result= new int[digits.length+1];
		
		//since everything is 0 change first thing to 1
		result[0]=1;
		return result;
	}

}
