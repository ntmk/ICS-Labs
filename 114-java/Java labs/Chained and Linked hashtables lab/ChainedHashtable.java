import java.util.LinkedList;
import java.lang.Math;
import java.util.ListIterator;

public class ChainedHashtable implements LabHashtable {

    private int size;
    private LinkedList[] table;
	
    public Object[] getTable() { 
		return table; 
	}
	
	public ChainedHashtable() {
		table = new LinkedList[100];
		for (int i = 0; i < table.length; i++) {
			table[i] = null;
		}
		size = 0;
	}


	public void put(Object key, Object value) {
		//System.out.println("Entering put");
		int bucket;
		size = getSize();
		////System.out.println("Key: " + key + " value: " + value);
		HashData data = new HashData();
		data.key = key;
		data.value = value;
		
		
		if ((size * 1.25) >= table.length) {
			resize();
		}
		
		bucket = Math.abs(key.hashCode()) % table.length;
		
		if (table[bucket] == null) {
			table[bucket] = new LinkedList <HashData> ();
			table[bucket].add(data);
			size++;
			////System.out.println("Created new list\n");
		} else {
			//System.out.println("collision\n");
			//LinkedList <HashData> linkedList = table[bucket];
			//int index = linkedList.indexOf(key);
			ListIterator<HashData> li = table[bucket].listIterator();
			boolean done = false;
			while (!done && li.hasNext()) {
				HashData current = li.next();
				if (current.key.equals(data.key)) {
					current.value = (int) current.value + (int) value;
					//System.out.println("increment the value\n");
					//System.out.println("new value is: " + current.value);
					
					done = true;
				}
			}		
			if (done == false) {
				table[bucket].add(data);
				size++;
				//System.out.println("adding new word\n");
			}		
		}	
		////System.out.println("Leaving put\n");
	}
	
	public Object get(Object key) {
		int bucket;
					
		bucket = Math.abs(key.hashCode()) % table.length;
		
		if (table[bucket] == null) {
			//System.out.println("null bucket, trying to get\n");
			return null;			
		} else {
			//System.out.println("bucket not null, trying to get\n");
			ListIterator<HashData> li = table[bucket].listIterator();
			boolean done = false;
			while (!done && li.hasNext()) {
				HashData current = li.next();
				if (current.key.equals(key)) {
					//System.out.println("retrieved the value!\n");
					return current.value;
				}
				
			}
			//System.out.println("tried to get, got null!\n");			
			return null;			
				
		}
	}
	
	public void resize() {
		LinkedList[] oldTable = table;
		table = new LinkedList[(table.length) * 2];
		for (LinkedList<HashData> item : oldTable) {
			if (item != null) {
				for (HashData data : item) {
					put(data.key, data.value);					
				}
			}
		}
	}	
	
	public int getSize() {
		return size;
	}
    	
}