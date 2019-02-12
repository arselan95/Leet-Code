

//check how many times string A is repeated such that string B is substring of A

/*
 * first of all, we need as to be at least as long as b:
a: "abc" "abc"
b: "abc abc" - in this case we need 2 copies of a;

a:"abc" "abc" "abc"
b: "c abc ab" - in this case we need 3 copies of a

We can tell we need at least 1 extra copy, b.length() / a.length() + 1 works fine when a.len / a.len == 0
But:
a: "abc" "abc" "abc"
b: "c abc a" - in this case we still need 3 copies of a, but a.len / b.len (5/3) only give you 1
That's why we want to add at least 2 copies.
 */
public class repeatedString {
	
	public static int check(String a, String b)
	{
		StringBuilder temp = new StringBuilder(a);
		int rep=0;
		for( rep=1; rep <= b.length()/a.length()+2; rep++)
		{
			if(temp.toString().contains(b)) 
			{
		//		System.out.println(rep);
				return rep;
				
			}
			temp.append(new StringBuilder(a));
		}
		
		
		
		return -1;
	}
	public static void main(String[] args)
	{
		check("abcd","cdabcdab");
	}

}
