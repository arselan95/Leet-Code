import java.util.ArrayList;
import java.util.List;

/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */
public class GenerateParenthesis {
	// left is how many "(" we can add after, right is how many ")" we can add
	// after.

	List<String> res = new ArrayList<String>();

	public List<String> generateParenthesis(int n) {
		helper("", n, 0);
		return res;
	}

	private void helper(String str, int left, int right) {
		if (left == 0 && right == 0)
			res.add(str);
		if (left > 0) {
			helper(str + "(", left - 1, right + 1);
		}
		if (right > 0) {
			helper(str + ")", left, right - 1);
		}
	}

	/*
	 * In java when we append a character to a string it makes the entire string
	 * again... i used a StringBuilder to alleviate that costly process. When a
	 * bracket is added and it is not valid it removes that brackets and attempt
	 * another path. The open brackets has a value of +1 and close bracket has a
	 * value of -1. The state variable is the sum of the values of brackets thus
	 * far. If state is negative we know we have more close brackets than open so a
	 * solution from there is impossible. This solution beats 100% (1ms). 
	 * 
	 * 
	 */
	/*
	 *  public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesisBacktrack(res, 2*n, new StringBuilder(), 0);
        return res;
    }
    
    void generateParenthesisBacktrack(List<String> res, int len, StringBuilder sb, int state) {
        if (sb.length() == len) {
            if (state == 0) res.add(sb.toString()); //if state == 0 then there are equal number of close brackets to open
            return;
        }
        if (state < 0) return; //if more close brackets than open brackets no further solutions possible from this path

        sb.append('(');
        generateParenthesisBacktrack(res, len, sb, state+1);
        sb.deleteCharAt(sb.length()-1);

        sb.append(')');
        generateParenthesisBacktrack(res, len, sb, state-1);
        sb.deleteCharAt(sb.length()-1);
    }
	 */

}
