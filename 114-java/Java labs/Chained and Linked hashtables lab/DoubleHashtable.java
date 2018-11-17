import java.lang.Math;


public class DoubleHashtable implements LabHashtable {

// Variables used to manage the secondary hash function. You do not need to
// modify or reference these in your own code.
	private int currentArraySize;
	private int currentStepFactor;

// Variables used for the actual hashtable.
private int size;
private HashData[] table;

public Object[] getTable() { 
	return table; 
}

// No-arg constructor creates a hashtable with initial capacity of 11.
	public DoubleHashtable() {
	       
// Default values for the instance data members.
		size = 0;
		currentArraySize = 0;
		currentStepFactor = 1;
		table = new HashData[11];
        	// TO-DO: create the hashtable array as specified.
// ...
	}
	
// Check to see if the table is 75% full; if so, make a new array of size equal
// to **THE NEAREST PRIME NUMBER AFTER** twice the current array size. 
	private void resizeIfNecessary() {
		if ((size * 1.25) >= table.length) {
			HashData[] oldTable = table;
			table = new HashData[Primes.nextPrime(table.length * 2)];
			for (HashData item : oldTable) {
				if (item != null) {
					put(item.key, item.value);					
				}
			}
		}

	}

	/**
* A helper method to compute the step factor needed for double-hashing.  We
* cache the last step factor, so we don't have to recalculate with every hash.
*
* @return the current step factor to use in calculating the secondary hash value.
*/
private int stepFactor() {
	if (table.length != currentArraySize) {
  		currentStepFactor = Primes.nextPrime(Math.max(30, table.length / 1000))
		% table.length;	
		currentArraySize = table.length;
    }
    return currentStepFactor;
}

// Insert a new key/value pair into the hashtable using double-hashing.
public void put(Object key, Object value) {
		int bucket;
		size = getSize();
		HashData data = new HashData();
		data.key = key;
		data.value = value;
		boolean done = false;
		
		bucket = Math.abs(key.hashCode()) % table.length;
		//System.out.println("Bucket: " + bucket);
		//System.out.println("Table length: " + table.length);
		//System.out.println("Key: " + key);
		//System.out.println("Value: " + value + "\n");
		int step = Math.abs(stepFactor() - Math.abs(key.hashCode()) % table.length);
		if (step == 0) step = 1;
		
		while (!done) {
			//System.out.println("1. Entering put loop\n");
			if (table[bucket] == null) {
				//System.out.println("2. Table bucket is null\n");
				table[bucket] = data;
				size++;
				done = true;
			} else {
				//System.out.println("2. Table bucket is not null\n");
				if (table[bucket].key.equals(key)) {
					//System.out.println("3. All good\n");
					table[bucket].value = (int) table[bucket].value + (int) value;
					//System.out.println("New value: " + table[bucket].value);
					done = true;
				} else {
					//System.out.println("3. Increment bucket\n");
					bucket += step;
					if (bucket >= table.length) {
						bucket = bucket % table.length;
					}
				}
			}				
		}
		resizeIfNecessary();
}			
// TO-DO: make a new HashData object, and insert it into the table.
// ...
        
        
// After inserting check to see if resizing is necessary

// Try to find the object value associated with the requested key; return the
// object value if found, or null if the key is not in the table.
public Object get(Object key) {
	
	int step = Math.abs(stepFactor() - Math.abs(key.hashCode()) % table.length);
	if (step == 0) step = 1;
	int bucket;				
	bucket = Math.abs(key.hashCode()) % table.length;
	boolean done = false;
	while (!done) {
		if (table[bucket] == null) {
			//System.out.println("Bucket's null!");
			return null;			
		} 
		else {
			if (table[bucket].key.equals(key)) {
				//System.out.println("Bucket's returning a value");
				return table[bucket].value;				
			} else {
				bucket += step;
				if (bucket >= table.length) {
					bucket = bucket % table.length;
				}
			}
		}
	}
	return null;
}

	
// Returns the total number of key/value pairs currently stored in this hashtable.
public int getSize() {
   		return size;
	}

}
