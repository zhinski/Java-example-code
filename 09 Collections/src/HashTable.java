import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedList;

public class HashTable<K, V> {
	LinkedList<SimpleEntry<K, V>>[] table;
	
	@SuppressWarnings("unchecked")
	public HashTable() {
		table = new LinkedList[128];
	}
	
	public void put(K key, V value) {
		int hashCode = key.hashCode() & (table.length - 1); 
		LinkedList<SimpleEntry<K, V>> pairsAtIndex = table[hashCode];
		if(pairsAtIndex == null) {
			table[hashCode] = new LinkedList<>();
			table[hashCode].add(new SimpleEntry<>(key, value));
		}
		else {
			// look for the key
			for(int i = 0; i < pairsAtIndex.size(); i++) {
				// does this pair have the key we are looking for?
				if(pairsAtIndex.get(i).getKey().equals(key)) {
					pairsAtIndex.get(i).setValue(value);
					return;
				}
			}
			// we never found the key
			pairsAtIndex.add(new SimpleEntry<>(key, value));
		}
	}
	
	public V get(K key) {
		int hashCode = key.hashCode() & (table.length - 1); 
		LinkedList<SimpleEntry<K, V>> pairsAtIndex = table[hashCode];
		if(pairsAtIndex == null) {
			// there are no keys at this index
			return null;
		}
		else {
			// go searching for this key in the collection of K,V pairs
			// at this index
			for(int i = 0; i < pairsAtIndex.size(); i++) {
				if(pairsAtIndex.get(i).getKey().equals(key)) {
					// we found the key, return its value
					return pairsAtIndex.get(i).getValue();
				}
			}
			return null; // key was not in the list
		}
	}
	
	public static void main(String[] args) {
		HashTable<String, Integer> table = new HashTable<>();
		table.put("David", 85);
		table.put("Anderson", 58);
		table.put("CS 143", 143);
		System.out.println(table.get("CS 143"));
		
		table.put("CS 143", 142);
		System.out.println(table.get("CS 143"));
		
		System.out.println(table.get("Hello!"));
	}
}
