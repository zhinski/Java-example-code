
public class Parens {

	public static void main(String[] args) {
		String e = "(1 + 2)";
		System.out.println(e + ": " + isBalanced(e));
		String f = "(((((((((((((((((((((((1 + 2)";
		System.out.println(f + ": " + isBalanced(f));
		String g = "(1 + 2) + 3 + (4 + 5))";
		System.out.println(g + ": " + isBalanced(g));
	}
	
	public static boolean isBalanced(String expression) {
		StringStack stack = new StringStack();
		
		for(int i = 0; i < expression.length(); i++) {
			String c = expression.substring(i, i + 1);
			if(c.equals("(")) {
				stack.push(c);
			}
			else if(c.equals(")")) {
				if(stack.size() == 0) {
					return false; // too many closing parens
				}
				else {
					stack.pop();
				}
			}
		}
		
		// if the size is 0, every ( had a matching )
		// if the size is not 0, there were too many (
		return stack.size() == 0;
	}

}
