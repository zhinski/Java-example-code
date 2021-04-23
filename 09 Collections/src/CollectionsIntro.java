import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> l = new LinkedList<>();
//		l.add("Hello!");
//		l.add("World!");
//		l.add("What's up?");
//		
//		System.out.println(l);
		
		Set<String> hash = new HashSet<>();
		Set<String> tree = new TreeSet<>();
		
		int n = 100;
		for(int i = n; i >= 50; i--) {
			hash.add(i + "");
			tree.add(i + "");
		}
		
		for(int i = 0; i < 50; i++) {
			hash.add(i + "");
			tree.add(i + "");
		}
		
		hash.add("0");
		tree.add("0");
		
		System.out.println("HashSet size: " + hash.size());
		System.out.println("TreeSet size: " + tree.size());
		System.out.println(hash);
		System.out.println(tree);
		
		Map<String, Integer> ages = new HashMap<>();
		ages.put("Bob", 22);
		ages.put("Shawn", 105);
		ages.put("Robin", 18);
		
		System.out.println(ages.get("Robin"));
		System.out.println(ages);
	}

}
