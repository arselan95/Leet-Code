import java.util.ArrayList;

//count prime numbers less than input of non negative integer n
public class countPtimes {
	
	
	public static void checkprime(int n) {
		ArrayList<Integer> p=new ArrayList<>();
	
		//create bool array prime 
		boolean prime[]= new boolean[n+1];
		
		for (int i=0;i<n;i++)
		{
			prime[i]=true;
		}
		
		for(int x=2; x*x <=n;x++)
		{
			if(prime[x]==true)
			{
				//update all multiples of x
				for(int i=x*x;i<=n;i+=x)
				{
					prime[i]=false;
				}
			}
		}
		
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==true)
			{
				 
				 //System.out.println(i);
				p.add(i);
			}
		}
		System.out.println(p.size());
		
	}
	
	public static void main(String[] args)
	{
		checkprime(10);
	}
	
	

}
