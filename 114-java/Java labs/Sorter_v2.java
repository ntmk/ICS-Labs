import java.util.Scanner;
import java.util.Arrays;

public class Sorter_v2 {
	
	public static void insertionSort(int [] data) {
		for (int i = 1; i < data.length; i++) {
			int value = data[i];
			int j = i-1;
			while (j >= 0 && data[j] > value) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = value;
		}
	}
	
	public static void selectionSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int smallest = i;
			for (int j = i+1; j < data.length; j++) {
				if (data[j] < data[smallest]) {
					smallest = j;
				}
			}
			int temp = data[i];
			data[i] = data[smallest];
			data[smallest] = temp;
		}
	}
	
	public static boolean validate(int[] data) {
		for (int i = 1; i < data.length; i++) {
			if (data[i] < data[i-1]) return false;
		}
		return true;
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
		
		
		// Make a copy of the original data to sort with Selection Sort.
		int[] ssData = Arrays.copyOf(data, data.length);
		
		// Sort using Selection Sort, and time how long it takes.
		long start = System.currentTimeMillis();
		selectionSort(ssData);
		long stop = System.currentTimeMillis();
		
		// Validate the sort, and print the runtime.
		System.out.println("SELECTION SORT: " + ( validate(ssData) ? "sorted" : "unsorted" ) + ", " + (stop - start) + " ms.");
		

		// Make a copy of the original data to sort with Insertion Sort.
		int[] isData = Arrays.copyOf(data, data.length);
		
		// Sort using Selection Sort, and time how long it takes.
		start = System.currentTimeMillis();
		insertionSort(isData);
		stop = System.currentTimeMillis();
		
		// Validate the sort, and print the runtime.
		System.out.println("INSERTION SORT: " + ( validate(isData) ? "sorted" : "unsorted" ) + ", " + (stop - start) + " ms.");
		
	}
	
}
