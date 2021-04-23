import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WeatherData {

	public static void main(String[] args) throws FileNotFoundException {
		// "What is the maximum temperature that we have 
		// recorded in the Tacoma area?"
		
		// Open the file
		// Let's try a hardcoded path.
		Scanner lines = new Scanner(new File("C:\\Users\\Public\\Downloads\\1934774.csv"));
		Set<Integer> maxTemps = new TreeSet<>();
		// Look at the first 10 lines for now
		//for (int x = 0; x < 10; x++) {
		lines.nextLine(); // throw out first row
		while (lines.hasNextLine()) {
			// Retrieve a new line (row/record) from the file
			String row = lines.nextLine();
			// We will convert the row into individual columns.
			// We'll write a loop that looks for quotes.
			// We'll interpret everything in between a pair of quotes
			// as a single column.
			// We have to keep track of whether or not i is currently
			// inside of a quoted string.
			boolean inQuotes = false; // No quotes to start with
			String currentColumn = "";
			ArrayList<String> columns = new ArrayList<>();
			for (int i = 0; i < row.length(); i++) {
				if (row.charAt(i) == '"') {
					// Are we in quotes?
					// We are if we weren't, and we aren't if we were.
					// Flip the inQuotes variable.
					inQuotes = !inQuotes;
				} else if (inQuotes || row.charAt(i) != ',') {
					// Append the current character to the
					// current column text.
					currentColumn += row.charAt(i);
				} else if (row.charAt(i) == ',') {
					// Append the current column text to the end
					// of the ArrayList (columns)
					columns.add(currentColumn);
					currentColumn = "";
				}
			}
			// There is no trailing comma, so whatever is left in
			// the currentColumn variable is the last column.
			// Append the current column text to the end
			// of the ArrayList (columns)
			columns.add(currentColumn);
			currentColumn = "";
			// We can interpret the columns arraylist.
			if (columns.get(16).trim().length() > 0) {
				// Assume it's an integer...
				maxTemps.add(Integer.parseInt(columns.get(16).trim()));
			}
			//System.out.println(columns.get(16));
		}
		System.out.println(maxTemps);
	}

}
