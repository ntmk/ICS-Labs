import java.util.Scanner;

public class QuickSorter extends Sorter {
	public QuickSorter(int[] od) {
		super(od);
	}
    
    public int partition( int start, int end) {
        int low = 0;
        int high = 0;
        int midpoint = 0;
        // int pivot = 0; don't initialize if you don't have to!
          int pivot;
          int temp = 0;
          boolean done = false;

          /* Pick middle element as pivot */
          midpoint = start + (end - start) / 2;
          pivot = data[midpoint];
        
          low = start;
          high = end;

          while (!done) {
             /* Increment low while data[low] < pivot */
             while (data[low] < pivot) {
                ++low;
             }

             /* Decrement h while pivot < data[h] */
             while (pivot < data[high]) {
                --high;
             }

             /* If there are zero or one items remaining,
                all data are partitioned. Return h */
             if (low >= high) {
                done = true;
             } 
             else {
                /* Swap data[low] and data[high],
                   update low and high */
                temp = data[low];
                data[low] = data[high];
                data[high] = temp;

                ++low;
                --high;
             }
          }
          return high;
    }

    public void quicksort(int start, int end) {
        int lowPartitionEnd = 0;

        /* Base case: If there are 1 or zero entries to sort,
        partition is already sorted */
        if (start >= end) {
            return;
        }

        /* Partition the data within the array. Value lowParttition returned
           from partitioning is location of last item in low partition. */
        lowPartitionEnd = partition(start, end);

        /* Recursively sort low partition (start to lowPartitionEnd) and
           high partition (lowPartitionEnd + 1 to end) */
           
        quicksort(start, lowPartitionEnd);
        quicksort(lowPartitionEnd + 1, end);

        return;
    }
   
    public void sort() {
        quicksort(0, data.length-1);
    }

}