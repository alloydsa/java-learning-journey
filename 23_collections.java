// collections in java is a framework that provides a set of classes and interfaces for storing and manipulating groups of objects.
// The collections framework includes data structures such as lists, sets, and
// maps, as well as algorithms for sorting and searching.        

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class collections {
    public static void main(String[] args) {

        Collection<Integer> nums = new java.util.ArrayList<Integer>(); // Creating a collection using ArrayList
        nums.add(1); // Adding elements to the collection
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println("Collection of array : " + nums); // Printing the collection

        for (int num : nums) { // Iterating through the collection
            System.out.println("Number: " + num); // Printing each number in the collection
        }

        // --------------------------------------------------------- //

        // List is an ordered collection (also known as a sequence). Lists can contain
        // duplicate elements. The user can access elements by their integer index
        // (position in the list), and search for elements in the list.
        // The user can also insert and remove elements from a list.
        // The List interface provides a way to store and manipulate a sequence of
        // elements. It extends the Collection interface and provides additional methods
        // for accessing and manipulating elements based on their index.

        List<Integer> list = new java.util.ArrayList<Integer>(); // Creating a list using ArrayList
        list.add(19); // Adding elements to the list
        list.add(24);
        list.add(302);
        list.add(3);

        System.out.println("List of numbers: " + list); // Printing the list
        for (int i = 0; i < list.size(); i++) { // Iterating through the list
            System.out.println("List element at index " + i + ": " + list.get(i)); // Printing each element in the list
        }

        Collections.sort(list);

        System.out.println("Sorted List of numbers: " + list); // Printing the sorted list

        // ---------------------------------------------------------- //
        // Comparator is an interface in Java that defines a method for comparing two
        // objects. It is used to provide a custom ordering for objects in a collection,
        // such as sorting a list or a set. The Comparator interface has a single method
        // called compare(), which takes two objects as parameters and returns an
        // integer
        // value indicating their relative order. A negative value indicates that the
        // first object is less than the second, a positive value indicates that the
        // first object is greater than the second, and zero indicates that the two
        // objects are equal.

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                }
                return -1; // Custom comparison logic based on the last digit of the numbers
            }
        };
        Collections.sort(list, comparator);

        System.out.println("Sorted List of numbers with custom comparator: " + list); // Printing the sorted list

        // --------------------------------------------------------- //

        // Set is a collection that does not allow duplicate elements. It models the
        // mathematical set abstraction. The Set interface provides a way to store and
        // manipulate a collection of unique elements. It extends the Collection
        // interface and provides additional methods for checking the presence of
        // elements, removing elements, and performing set operations such as union,
        // intersection, and difference.
        // sorting is not supported in Set, as it is an unordered collection.
        // It does not support index-based access like List does. Instead, it provides
        // methods for adding, removing, and checking the presence of elements.
        Set<Integer> set = new java.util.HashSet<Integer>(); // Creating a set using HashSet
        set.add(1); // Adding elements to the set
        set.add(2);
        set.add(76);
        set.add(3);
        set.add(3); // Duplicate element, will not be added

        System.out.println("Set of numbers: " + set); // Printing the set
        for (Integer num : set) { // Iterating through the set
            System.out.println("Set element: " + num); // Printing each element in the set
        }

        // --------------------------------------------------------- //
        // TreeSet is a part of the Java Collections Framework and implements the Set
        // interface. It is a collection that stores elements in a sorted order, based
        // on their natural ordering or a specified comparator. TreeSet is backed by a
        // Red-Black tree, which is a self-balancing binary search tree. This means
        // that the elements in a TreeSet are always sorted, and the operations such as
        // add, remove, and contains are performed in logarithmic time complexity.

        // TreeSet does not allow duplicate elements, and it does not maintain the
        // insertion order of elements. Instead, it sorts the elements based on their
        // natural ordering or a specified comparator.

        TreeSet<Integer> treeSet = new TreeSet<Integer>(); // Creating a TreeSet
        treeSet.add(5); // Adding elements to the TreeSet
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(1); // Adding elements to the TreeSet
        treeSet.add(2); // Adding elements to the TreeSet
        System.out.println("TreeSet of numbers: " + treeSet); // Printing the TreeSet
        for (Integer num : treeSet) { // Iterating through the TreeSet
            System.out.println("TreeSet element: " + num); // Printing each element in the TreeSet
        }

        Iterator<Integer> iterator = treeSet.iterator(); // Creating an iterator for the TreeSet

        while (iterator.hasNext()) { // Iterating through the TreeSet using the iterator
            Integer num = iterator.next(); // Getting the next element in the TreeSet
            System.out.println("TreeSet element using iterator: " + num); // Printing each element in the TreeSet
        }

        // --------------------------------------------------------- //

        // Map is an object that maps keys to values. A map cannot contain duplicate
        // keys;
        // each key can map to at most one value. The Map interface provides a way to
        // store and manipulate a collection of key-value pairs. It extends the
        // Collection interface and provides additional methods for adding, removing,
        // and accessing elements based on their keys. Maps are often used to store
        // data in a way that allows for fast retrieval based on keys, such as in
        // dictionaries or hash tables.
        // The Map interface does not extend the Collection interface, as it does not
        // represent a collection of elements, but rather a collection of key-value
        // pairs. However, it does provide methods for accessing the keys and values as
        // collections, allowing for iteration over the keys and values separately.

        Map<String, Integer> mp = new java.util.HashMap<String, Integer>(); // Creating a map using HashMap
        mp.put("Alloyd", 24); // Adding key-value pairs to the map
        mp.put("John", 30);
        mp.put("Jane", 28);
        System.out.println("Map of names and ages: " + mp); // Printing the map

        for (String name : mp.keySet()) { // Iterating through the keys of the map
            System.out.println("Name: " + name + ", Age: " + mp.get(name)); // Printing each key-value pair in the map
        }

        // Hashtable is a part of the Java Collections Framework and implements the Map
        // interface. It is a collection that stores key-value pairs, where each key is
        // unique and maps to a specific value. Hashtable is synchronized, which means
        // that it is thread-safe and can be used in a multi-threaded environment
        // without
        // the need for external synchronization. However, this also means that it is
        // generally slower than other map implementations such as HashMap, which is not
        // synchronized.

    }
}
// collection in java is interface that represents a group of objects.
// list has arraylist, linkedlist, vector
// set has hashset, linkedhashset, treeset
// map has hashmap, linkedhashmap, treemap
// queue has priorityqueue, deque, blockingqueue