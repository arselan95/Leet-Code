
public class Palindrome {

	public static boolean isPalindrome(String s) {

		//get rid of special characters using Reg-ex
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		/*
		 * or do it manually
		 */
		//s=s.replaceAll(" ", "");
		//s = s.replaceAll(",", "");
		//s = s.replaceAll(":", "");
		//s = s.replace(".", "");
		System.out.println(s);
		
		

		StringBuilder sb = new StringBuilder(s);

		// reverse the string
		String rev = sb.reverse().toString();

		// compare both strings
		if (s.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("yes");
			return true;
		}
		System.out.println("No");
		return false;

	}

	public static void main(String[] args) {
		isPalindrome("ab@a");
	}

}
