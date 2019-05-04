
public class Add_Binary_String {

	public String addBinary(String a, String b) {

		// WHy String builder?
		/*
		 * 
		 * Mutability Difference:
		 * 
		 * String is immutable, if you try to alter their values, another object gets
		 * created, whereas StringBuffer and StringBuilder are mutable so they can
		 * change their values.
		 * 
		 * Thread-Safety Difference:
		 * 
		 * The difference between StringBuffer and StringBuilder is that StringBuffer is
		 * thread-safe. So when the application needs to be run only in a single thread
		 * then it is better to use StringBuilder. StringBuilder is more efficient than
		 * StringBuffer.
		 * 
		 * Situations:
		 * 
		 * If your string is not going to change use a String class because a String
		 * object is immutable. If your string can change (example: lots of logic and
		 * operations in the construction of the string) and will only be accessed from
		 * a single thread, using a StringBuilder is good enough. If your string can
		 * change, and will be accessed from multiple threads, use a StringBuffer
		 * because StringBuffer is synchronous so you have thread-safety.
		 */

		StringBuilder sb = new StringBuilder();

		int i = a.length() - 1, j = b.length() - 1, carry = 0; // two pointers starting from the back, just think of
																// adding two regular ints from you add from back
		while (i >= 0 || j >= 0) {
			int sum = carry; // if there is a carry from the last addition, add it to carry
			if (j >= 0)

				/*
				 * he is just returning integer value from char. eg: 0-0=0 or 1-0=1
				 */
				sum += b.charAt(j--) - '0'; // we subtract '0' to get the int value of the char from the ascii
			if (i >= 0)
				sum += a.charAt(i--) - '0';
			sb.append(sum % 2); // if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 (just
								// like 1+9 is 0 if adding ints in columns)
			
			carry = sum / 2; // if sum==2 we have a carry, else no carry 1/2 rounds down to 0 in integer
								// arithematic
		}
		if (carry != 0)
			sb.append(carry); // leftover carry, add it
		return sb.reverse().toString();

	}

}
