
public class DLListTest {

	public static void main(String[] args) {
		DLList<String> list = new DLList<String>();
		int n = 1_000_000;
		for(int i = 0; i < n; i++) {
			list.add("Hi! " + String.valueOf(i)); // auto-boxing int -> Integer
		}
		
		// SLOW!!!!!!!!!!!
//		for(int i = 0; i < n; i++) {
//		System.out.println(list.get(i));
//	}
		
		for(String s : list) {
			System.out.println(s);
		}
		
		DLList<Boolean> b = new DLList<Boolean>();
		b.add(false); // false is a boolean, auto-boxed into an Object of type Boolean
		b.add(true);
		b.add(true);
		b.add(false);
		
		for(Boolean c : b) {
			System.out.println(c);
		}
	}

}
