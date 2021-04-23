public class StringStack {
	private InternalStringStack stack;
	
	public StringStack() {
		stack = null;
	}
	
	// pushes the data String to the top of the Stack
	public void push(String data) {
		stack = new InternalStringStack(data, stack);
	}
	
	// removes the top element from the Stack
	public String pop() {
		if(stack == null) {
			return null;
		}
		
		String data = stack.data; // store what was at the top of the stack
		stack = stack.rest; // removes the top of the stack
		return data;
	}
	
	// look at the top of the Stack (don't remove it!)
	public String peek() {
		if(stack == null) {
			return null;
		}
		return stack.data;
	}
	
	public int size() {
		if(stack == null) {
			return 0;
		}
		return stack.size();
	}
	
	public String toString() {
		if(stack == null) {
			return null;
		}
		return stack.toString();
	}
	
	private class InternalStringStack {
		// top of the stack
		private String data; 
		
		// rest of the stack (everything below the top)
		private InternalStringStack rest; 

		public InternalStringStack(String data, InternalStringStack rest) {
			this.data = data;
			this.rest = rest;
		}

		public String getData() {
			return data;
		}

		public InternalStringStack getRest() {
			return rest;
		}

		public int size() {
			if (rest == null) {
				return 1;
			}
			return 1 + rest.size();
		}
		
		public String toString() {
			if(rest == null) {
				return data;
			}
			return data + "\n" + rest.toString();
		}
	}
}