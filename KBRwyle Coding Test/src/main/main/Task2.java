package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author Mari Mercado (mmercado@alumni.cmu.edu)
 *
 */
public class Task2 {

	public static void main(String[] args) {
		// Collection containing 1-10, random order
		ArrayList<Integer> array1 = new ArrayList<>();
		for (int i=0; i<10; i++) {
			array1.add(i+1);
		}
		Collections.shuffle(array1);
		// Collection containing 6-15, random order
		ArrayList<Integer> array2 = new ArrayList<>();
		for (int i=5; i<15; i++) {
			array2.add(i+1);
		}
		Collections.shuffle(array2);
		// Print both collections
		System.out.println("array1: " + array1.toString() + " array2: " + 
						   array2.toString());
		// Print both collection sizes
		System.out.println("array1 size: " + array1.size() + " array2 size: " +
						   array2.size());
		
		// Combine the two collections without duplicated, sorted
		TreeSet<Integer> set = new TreeSet<>(array1);
		set.addAll(array2);
		// Remove the middle entry (middle entry of 1-15 is 8)
		set.remove(8);
		// Print collection in reverse order
		ArrayList<Integer> setArray = new ArrayList<>(set);
		Collections.reverse(setArray);
		System.out.println("set reversed: " + setArray.toString());
		// Print collections size
		System.out.println("set size: " + setArray.size());
		
		// A collection that has key value pairs
		HashMap<String, String> hashmap = new HashMap<>();
		// Add five pairs
		hashmap.put("American Gods", "Neil Gaiman");
		hashmap.put("Harry Potter and the Sorcerer's Stone", "J. K. Rowling");
		hashmap.put("A Game of Thrones", "George R. R. Martin");
		hashmap.put("The Fellowship of the Ring ", "J. R. R. Tolkien");
		hashmap.put("The Hunger Games", "Suzanne Collins");
		// Add a duplicate pair
		hashmap.put("American Gods", "Neil Gaiman");
		// Print duplicate pair if found
		System.out.println("duplicate: key: American Gods value: " +
						   hashmap.get("American Gods"));
		// Print the key value pairs
		System.out.println("hashmap: " + hashmap.toString());
		// Print the size of the collection
		System.out.println("hashmap size: " + hashmap.size());
		
		/* I choose a HashMap because it has amortized constant access, and is 
		 * generally better performance wise if one does not care about the order
		 * of the collection. However, maps cannot have duplicate keys, and every
		 * key can only map to one value. So I'm not really sure how to add a 
		 * duplicate key/value pair or how to check that it's there after it
		 * has been added, as it shouldn't have been added. */
	}
}
