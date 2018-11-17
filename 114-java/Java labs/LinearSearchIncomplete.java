import java.util.Scanner;
/* 
	Your friend is trying to write a Java program using fundamental programming constructs (i.e. no objects)
	to perform a linear search on an array. Your task is to complete the code as the comments indciate.
*/

public class LinearSearchIncomplete {
	/*
		Declare two integer constants: NOT_FOUND and DONE.
		Both are to have the value of -1.
		
	*/
	final static int NOT_FOUND = -1
	final static int DONE = -1
	
	/*
		Complete the method header by supplying the formal parameters.
		There are two formal parameters. The first one is an integer array
		named numbers and the second is an integer named key.
	*/
	public static int linearSearch(int numbers, int key) {
		int i=0;
		
		/*
			Write a while loop to search through the array for the value, key.
			If found, return the index at which key was found, otherwise, return
			the constant NOT_FOUND.
		*/
		while (i < numbers.length()) {
			if (numbers[i] == key)
				return i;
			else
				i++;
		}
		return NOT_FOUND;
		
	}
   
	/* 
		Complete the method header by supplying the formal parameter list.
		There is one formal parameter, an an integer array named numbers.
	*/
	public static void displayArray(int numbers) {
		System.out.println("\nArray:\n");
		System.out.println("Index\tContents");
		
		/*
			Write a for loop that displays the contents of the array, numbers
			and the corresponding indices.
		*/
		for (i = 0;
		
	}
   
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		/*
			Declare an array called numbers and initialize it to have 8 integer
			values of your choice.
		*/
		int[] numbers = {1,2,3,4,5,6,7,8}
		int i = 0;
		int key;
		int keyIndex;

		System.out.println("\nLINEAR SEARCH of an ARRAY\n");
		do {
			displayArray(numbers);
		
			System.out.print("\n\n-----> What should I search for? (-1 quits) ");
			key = scnr.nextInt();
			
			/* 
				Write a nested if statement that will display to the screen a statement
				indicating if the key value was found in the array or not. If it was found
				display the index position at which it was found.
			*/
			
			
		}
		while (key == NOT_FOUND);
		
		/* supply the end of the do-while loop here */
		
	System.out.println("LinearSearch finished.");
	return;
	}

}