
public class TestIntArray {

	public static void main(String[] args) {
		IntArray a = new IntArray();
		for(int i = 0; i < 1000000; i++) {
			a.add(i);
			System.out.println(i + " length: " + a.size());
		}
	}
}
