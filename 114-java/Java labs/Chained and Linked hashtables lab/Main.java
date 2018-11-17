import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

    String[] targets = {"the", "Adventure", "fish", "murmured", "committed"};

        // 1. create a ChainedHashtable, and add all elements from Big.java
		
	ChainedHashtable table = new ChainedHashtable();
	Scanner sc = new Scanner(new File("Big.java"));
	
    while (sc.hasNext()) {
		String word = sc.next();
		int value = 1;
		table.put(word, value);
		//Integer value = (Integer) table.get(word);
		//if (value == null) {
		//	table.put(word, new Integer(1));
		/*} else {			
			int v = value.intValue();
			v++;
			System.out.println(v);
			table.put(word, new Integer(v));
			
		}*/	
	}
		
    System.out.println("CHAINING\n--------\n");
        long startTime = System.currentTimeMillis();
    //...

        // 2. Look up and output the counts for targets.
	for (String item : targets) {
		Integer value = (Integer) table.get(item);
		if (value == null) {
			System.out.println(item + ": 0");
		} else {
			System.out.println(item + ": " + value);
		}				
	}
        // ...

        long endTime = System.currentTimeMillis();
        System.out.println("Time for Chaining: " + (endTime - startTime) + "ms.");


        // 3. create a DoubleHashtable, and add all elements from Big.java
    System.out.println("\n\nDOUBLE HASHING\n---------------\n");
    System.gc();
        startTime = System.currentTimeMillis();
        // ...
		
	DoubleHashtable table2 = new DoubleHashtable();
	sc = new Scanner(new File("Big.java"));
	while (sc.hasNext()) {
		String word = sc.next();
		int value = 1;
		table2.put(word, value);
	/*while (sc.hasNext()) {
		String word = sc.next();
		Integer value = (Integer) table2.get(word);
		if (value == null) {
			table2.put(word, new Integer(1));
		} else {
			int v = value.intValue();
			v++;
			table2.put(word, new Integer(v));
		}*/
	}


        // 4. Look up and output the counts for targets.
    // ...
	
	for (String item : targets) {
		Integer value = (Integer) table2.get(item); 
		if (value == null) {
			System.out.println(item + ": 0");
		} else {
			System.out.println(item + ": " + value);
		}				
	}

        endTime = System.currentTimeMillis();
        System.out.println("Time for Double Hashing: " + (endTime - startTime) + "ms.");
    }
}