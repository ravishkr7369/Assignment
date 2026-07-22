public class ValidParenthesis {

	public static int longestValidParentheses(String s) {

		int n = s.length(); // calculate length
		int[] stack = new int[n + 1]; // initialize new stack with length n+1
		int index = -1; // for set lower boundry
		int maxLength = 0;

		stack[++index] = -1;

		for (int i = 0; i < n; i++) {

			if (s.charAt(i) == '(') {
				stack[++index] = i;
			} else {

				index--;

				if (index == -1) {
					stack[++index] = i;
				} else {
					maxLength = Math.max(maxLength, i - stack[index]); // calculate length of the longest valid
																		// parenthesis
				}
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {

		String s = "(())";

		System.out.println(longestValidParentheses(s));
	}
}
