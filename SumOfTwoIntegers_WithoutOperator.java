/*
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example 1:

Input: a = 1, b = 2
Output: 3
 */
public class SumOfTwoIntegers_WithoutOperator {
	public int getSum(int a, int b) {

		// repeat until no carry 'c' which is stored in 'b' returns a 0.
		while (b != 0) {
			// carry bit 'c' to add integers

			// (a&b) is the sum of two integers decomposed in bit

			// a^b is the carry bit
			int c = ((a & b) << 1);

			// '<<'' set carry bit

			// store sum in 'a'
			a ^= b;
			b = c;
		}
		return a;

	}

}
