import java.util.Scanner;
import java.util.Arrays;

public abstract class Sorter {
	
	protected int[] data;

	protected Sorter(int[] od) {
		data = Arrays.copyOf(od, od.length);
	}

	public abstract void sort();

	
	public boolean validate() {
		for (int i = 1; i < data.length; i++) {
			if (data[i] < data[i-1]) return false;
		}
		return true;
	}

	public String toString() {
		return Arrays.toString(data);
	}
	
	public static void main(String[] args) {
		
		// Read in the original data array from System.in. First number is
		// n, following by n integers.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		
		
		// Sort using Selection Sort, and time how long it takes.
		SelectionSorter ssorter = new SelectionSorter(data);
		long start = System.currentTimeMillis();
		ssorter.sort();
		long stop = System.currentTimeMillis();
		boolean sorted = ssorter.validate();

		System.out.print("SELECTION SORT: ");
		if (sorted) System.out.print("sorted");
		else System.out.print("unsorted");
		System.out.println(", " + (stop - start) + " ms.");
		

		// Sort using InsertionSort, and time how long it takes.
		InsertionSorter isorter = new InsertionSorter(data);
		start = System.currentTimeMillis();
		isorter.sort();
		stop = System.currentTimeMillis();
		
		sorted = isorter.validate();
		System.out.print("INSERTION SORT: ");
		if (sorted) System.out.print("sorted");
		else System.out.print("unsorted");
		System.out.println(", " + (stop - start) + " ms.");
	}
	
}
