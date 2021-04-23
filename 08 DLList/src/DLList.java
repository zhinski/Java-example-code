import java.util.Iterator;

public class DLList<T> implements Iterable<T>{
	
	private Node<T> start; // first Node in the list
	private Node<T> end; // last Node in the list
	
	public DLList() {
		start = end = null;
	}
	
	// add a Node to the end of the list
	public void add(T s) {
		if(start == null) { // empty list
			// start and the end are the same in a singleton list
			start = end = new Node<T>(); 
			start.data = s;
		}
		// nonempty list, attach a new Node to the end
		else {
			// attach a new Node to the end
			end.next = new Node<T>();
			// build a backwards link between the new Node and the old end Node
			end.next.prev = end;
			// add the data to the new end Node
			end.next.data = s;
			// now the new Node is end of the list
			end = end.next;
		}
	}
	
	public T remove(int i) {
		Node<T> n = start;
		if(i < 0) {
			return null; // no T at a negative index
		}
		try {
			// walking through the list "i" times until we reach our destination
			// or go out of bounds (handled by catch block)
			for (int j = 0; j < i; j++) {
				n = n.next;
			}
			
			// if we are somewhere in the middle of the list de-link the reference
			// from the previous node to to the node we are removing
			if(n.prev != null) {
				n.prev.next = n.next;
			}
			// otherwise, we are at the beginning of the list, move the start up by one
			else {
				start = n.next;
			}
			
			// if we are somewhere in the middle of the list de-link the reference
			// from the next node to the node we are removing
			if(n.next != null) {
				n.next.prev = n.prev;
			}
			// otherwise, we are at the end of the list, move the end back by one
			else {
				end = n.prev;
			}
			
			return n.data;
		} 
		catch (NullPointerException e) {
			return null; // no T at an index greater than the size of the list
		}
	}
	
	public T get(int i) {
		Node<T> n = start;
		if(i < 0) {
			return null; // no T at a negative index
		}
		try {
			for (int j = 0; j < i; j++) {
				n = n.next;
			}
			return n.data;
		} 
		catch (NullPointerException e) {
			return null;
		}
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Conductor<T>(start);
	}
	
	private static class Conductor<T> implements Iterator<T>{
		
		private Node<T> current; // Node that the iterator is currently looking at
		
		public Conductor(Node<T> n) {
			current = n;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T s = current.data; // retrieve the data in the current Node
			current = current.next;
			return s;
		}
	}
	
	private static class Node<T> {
		private T data;
		private Node<T> prev;
		private Node<T> next;
	}
}
