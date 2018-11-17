public class SelectionSorter extends Sorter {

	public SelectionSorter(int[] od) {
		super(od);
	}

	public void sort() {
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
}
