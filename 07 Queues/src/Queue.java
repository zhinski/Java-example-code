public class Queue {
	private InternalQueue start;
	private InternalQueue end;
	
	public Queue() {
		start = null;
		end = null;
	}
	
	// remove the first thing from the queue
	public String remove() {
		if(start == null) {
			return null;
		}
		
		String data = start.data; // store what was at the top of the queue
		start = start.rest; // removes the first thing in the queue
		
		// if we removed the last thing in the queue, the end should reference null
		if(start == null) {
			end = null;
		}
		
		return data;
	}
	
	public void add(String data) {
		// queue is empty, create a singleton queue!
		if(start == null) {
			start = new InternalQueue(data, null);
			end = start;
		}
		else {
//			InternalQueue q = start; // copying the reference to beginning to a new variable
			
//			// "walk" to the end of the queue
//			while(q.getRest() != null) {
//				q = q.rest;
//			}
//			
//			// now q points to the last node in the queue, add "data" to the end
//			q.setRest(new InternalQueue(data, null));
			
			// no need to walk to the end, we have a direct route
			end.setRest(new InternalQueue(data, null));
			// advance the end forward 
			end = end.getRest();
		}
	}
	
	public int size() {
		if(start == null) {
			return 0;
		}
		return start.size();
	}
	
	public String toString() {
		if(start == null) {
			return null;
		}
		return start.toString();
	}
	
	private class InternalQueue {
		// beginning of the queue
		private String data; 
		
		// rest of the queue (everything after the beginning)
		private InternalQueue rest; 

		public InternalQueue(String data, InternalQueue rest) {
			this.data = data;
			this.rest = rest;
		}

		public String getData() {
			return data;
		}

		public InternalQueue getRest() {
			return rest;
		}

		public void setRest(InternalQueue rest) {
			this.rest = rest;
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
			return data + ", " + rest.toString();
		}
	}
}
