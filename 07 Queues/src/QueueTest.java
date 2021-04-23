
public class QueueTest {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("David");
		queue.add("Anderson");
		queue.add("Tacoma");
		queue.add("Seattle");
		queue.add("Washington");
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
	}

}
