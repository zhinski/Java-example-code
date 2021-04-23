
public class StringStackTest {

	public static void main(String[] args) {
		StringStack stack = new StringStack();
		stack.push("TCC");
		stack.push("Tacoma");
		stack.push("Washington");
		System.out.println(stack);
		System.out.println();
		
		// look at the top
		System.out.println(stack.peek());
		System.out.println();
		System.out.println(stack);
		System.out.println();
		
		// remove from the top
		System.out.println(stack.pop());
		System.out.println();
		System.out.println(stack);
	}

}
