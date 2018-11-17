public class MergeSorter extends Sorter {
	
	public MergeSorter(int[] od) {
		super(od);
	}

	private void merge(int start, int midpoint, int end) {
      int mergedSize = end - start + 1;       // Size of merged partition
      int mergedData [] = new int[mergedSize]; // Temporary array for merged data
      int mergePos = 0;                 // Position to insert merged number
      int leftPos = 0;                  // Position of elements in left partition
      int rightPos = 0;                 // Position of elements in right partition

      leftPos = start;                      // Initialize left partition position
      rightPos = midpoint + 1;                 // Initialize right partition position

      // Add smallest element from left or right partition to merged data
      while (leftPos <= midpoint && rightPos <= end) {
         if (data[leftPos] < data[rightPos]) {
            mergedData[mergePos] = data[leftPos];
            ++leftPos;
         } 
         else {
            mergedData[mergePos] = data[rightPos];
            ++rightPos;
         }
         ++mergePos;
      }

      // If left partition is not empty, add remaining elements to merged data
      while (leftPos <= midpoint) {
         mergedData[mergePos] = data[leftPos];
         ++leftPos;
         ++mergePos;
      }

      // If right partition is not empty, add remaining elements to merged data
      while (rightPos <= end) {
         mergedData[mergePos] = data[rightPos];
         ++rightPos;
         ++mergePos;
      }

      // Copy merge number back to data
      for (mergePos = 0; mergePos < mergedSize; ++mergePos) {
         data[start + mergePos] = mergedData[mergePos];
      }
    }

   private void mergeSort(int start, int end) {
      int midpoint = 0;

      if (start < end) {
         midpoint = (start + end) / 2;  // Find the midpoint in the partition

         // Recursively sort left and right partitions
         mergeSort(start, midpoint);
         mergeSort(midpoint + 1, end);

         // Merge left and right partition in sorted order
         merge(start, midpoint, end);
      }
    }
   
    public void sort() {
		mergeSort(0, data.length-1);
	}

}
