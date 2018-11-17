public class InsertionSorter extends Sorter {
	
	public InsertionSorter(int[] od) {
		super(od);
	}

	public void sort() {
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
}
