import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Census {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("Names_2010Census.csv"));
		Map<String, Data> namesMap = new TreeMap<>();
		Map<Integer, Data> ranksMap = new TreeMap<>();
		file.nextLine(); // get rid of "heading"
		while(file.hasNextLine()) {
			Scanner line = new Scanner(file.nextLine());
			line.useDelimiter(",");
			
			String name = line.next();
			int rank = line.nextInt();
			int count = line.nextInt();
			double prop = line.nextDouble();
			
			Data data = new Data(name, rank, count, prop);
			namesMap.put(name, data);
			ranksMap.put(rank, data);
			
			line.close();
		}
		file.close();
		
		Scanner in = new Scanner(System.in);
		while(true) {
			if(in.hasNextInt()) {
				System.out.println(ranksMap.get(in.nextInt()));
			}
			else {
				System.out.println(namesMap.get(in.next().toUpperCase()));
			}
		}
	}
	
	public static class Data{
		public final String name;
		public final int rank;
		public final int count;
		public final double prop100k;
		
		public Data(String name, int rank, int count, double prop100k) {
			this.name = name;
			this.rank = rank;
			this.count = count;
			this.prop100k = prop100k;
		}

		@Override
		public String toString() {
			return name + ": rank=" + rank + ", count=" + count + ", prop100k=" + prop100k;
		}
		
		

	}

}
