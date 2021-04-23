import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HiClass {

//	public static void main(String[] args) throws FileNotFoundException {
//		String path = "hiclass.txt";
//		File file = new File(path);
//		Scanner s = new Scanner(file);
//		
//		while(s.hasNextLine()) {
//			String line = s.nextLine();
//			System.out.println(line);
//		}
//		s.close();
//	}
	
	public static void main(String[] args) {
		String path = "hiclass1.txt";
		File file = new File(path);
		
		Scanner s = null;
		try {
			s = new Scanner(file);
		}
		catch(FileNotFoundException e) {
			System.out.println(file.getName() + " does not exist!");
			return;
		}
		finally {
			
		}
		
		while(s.hasNextLine()) {
			String line = s.nextLine();
			System.out.println(line);
		}
		s.close();
	}

}
