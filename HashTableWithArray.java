
class HashTable {
	int capacity;
	int[] arr;
	
	public HashTable(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
	}
	
	public void insert(int element) {
		arr[element % capacity] = element;
	}
	
	public void delete(int element) {
		if(arr[element % capacity] == element) {
			arr[element % capacity] = 0;
		} else {
			System.out.println("No Element Found");
		}	
	}
	
	public void clear() {
		arr = new int[capacity];
	}

	public void contains(int element) {
		if(arr[element % capacity] == element) {
			System.out.println("Hashtable contains " + element);
		} else {
			System.out.println("Hashtable doesn't contain " + element);
		}
	}
	
	public void printTable() {
        System.out.print("\nHash Table = ");
        for (int i = 0; i < capacity; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}


public class HashTableWithArray {
	public static void main(String[] args) {
		
		int hashtableSize = 5;
		HashTable ht = new HashTable(hashtableSize);
		
		// Insert
		ht.insert(566);
		ht.insert(64);
		ht.insert(8);
		
		ht.printTable();
		
		// Delete
		ht.delete(64);
		
		ht.printTable();
		
		// Contains
		ht.contains(8);
		
		ht.printTable();
		
		// Clear
		ht.clear();
		
		ht.printTable();

	}
}
