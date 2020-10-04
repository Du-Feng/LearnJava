package com.example.generics;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Explores various functions of iterator
 *
 * @author Feng Du
 * @version 1.0
 * @see <a href="https://www.geeksforgeeks.org/iterators-in-java/">https://www.geeksforgeeks.org/iterators-in-java/</a>
 * for the complete instructions and code.
 */
public class IteratorDemo {
    /**
     * <strong>The main entrance to explore various functions of iterator.</strong>
     * <ul>
     *     <li><p>It invokes {@link #enumerationDemo()} to show how to use Enumeration to iterate Vector.</p></li>
     *     <li><p>It invokes {@link #iteratorDemo()} to show how to use Iterator to iterate ArrayList.</p></li>
     *     <li><p>It invokes {@link #listIteratorDemo()} to show how to use ListIterator to iterate ArrayList.</p></li>
     * </ul>
     *
     * @param args Optional
     */
    public static void main(String[] args) {
        enumerationDemo();
        iteratorDemo();
        listIteratorDemo();
    }

    /**
     * Demonstrates how to use Enumeration to iterate Vector.
     *
     * <p>It is a interface used to get elements of legacy collections(Vector, Hashtable).</p>
     * <p>Enumeration is the first iterator present from JDK 1.0, rests are included in JDK 1.2 with more functionality.</p>
     * <p>Enumerations are also used to specify the input streams to a SequenceInputStream.</p>
     * <p>We can create Enumeration object by calling elements() method of vector class on any vector object.</p>
     * <p><strong>Limitations of Enumeration</strong>:
     * <ul>
     *     <li><p>Enumeration is for <strong>legacy</strong> classes(Vector, Hashtable) only. Hence it is not a universal iterator.</p></li>
     *     <li><p>Remove operation can't be performed using Enumeration.</p></li>
     *     <li><p>Only forward direction iterating is possible.</p></li>
     * </ul>
     */
    private static void enumerationDemo() {
        System.out.println("\nDemonstrates how to use Enumeration to iterate Vector");
        // Create a vector and print its contents
        Vector v = new Vector();
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }
        System.out.println("vector = " + v);

        // At beginning e(cursor) will point to index just before the first element in v
        Enumeration e = v.elements();
        // Checking the next element availability
        while (e.hasMoreElements()) {
            // Moving cursor to next element
            int i = (Integer)e.nextElement();
            System.out.print(i + " ");
        }
    }

    /**
     * Demonstrates how to use Iterator to iterate ArrayList.
     *
     * <p>It is a <strong>universal</strong> iterator as we can apply it to any Collection object.
     * By using Iterator, we can perform both read and remove operations.
     * It is improved version of Enumeration with additional functionality of remove-ability of a element.</p>
     * <p>Iterator must be used whenever we want to enumerate elements in all Collection framework implemented interfaces
     * like Set, List, Queue, Deque and also in all implemented classes of Map interface.
     * Iterator is the only cursor available for entire collection framework.</p>
     * <p>Iterator object can be created by calling iterator() method present in Collection interface.</p>
     * <strong>Limitations of Iterator</strong>:
     * <ul>
     *     <li><p>Only forward direction iterating is possible.</p></li>
     *     <li><p>Replacement and addition of new element is not supported by Iterator.</p></li>
     * </ul>
     */
    private static void iteratorDemo() {
        System.out.println("\nDemonstrates how to use Iterator to iterate ArrayList");
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println(al);

        // At beginning itr(cursor) will point to index just before the first element in al
        Iterator itr = al.iterator();
        // Checking the next element availability
        while (itr.hasNext()) {
            // Moving cursor to next element
            int i = (Integer)itr.next();
            // Getting even elements one by one
            System.out.print(i + " ");
            // Removing odd elements
            if(i % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println();
        System.out.println(al);
    }

    /**
     * Demonstrates how to use ListIterator to iterate ArrayList.
     *
     * <p>It is only applicable for List collection implemented classes like arraylist, linkedlist etc. It provides bi-directional iteration.</p>
     * <p>ListIterator must be used when we want to enumerate elements of List. This cursor has more functionality(methods) than iterator.</p>
     * <p>ListIterator object can be created by calling listIterator() method present in List interface.</p>
     * <p><strong>Limitations of ListIterator</strong>:
     * It is the most powerful iterator but it is only applicable for List implemented classes, so it is not a universal iterator.</p>
     */
    private static void listIteratorDemo() {
        System.out.println("\nDemonstrates how to use ListIterator to iterate ArrayList.");
        ArrayList al = new ArrayList();
        for(int i = 0; i < 10; i++) {
            al.add(i);
        }
        System.out.println(al);

        // At beginning ltr(cursor) will point to index just before the first element in al
        ListIterator ltr = al.listIterator();
        // Checking the next element availability
        while (ltr.hasNext()) {
            // Moving cursor to next element
            int i = (Integer)ltr.next();
            // Getting even elements one by one
            System.out.println(i + " ");
            // Changing even numbers to odd and adding modified number again in iterator
            if(i % 2 == 0) {
                i++; // Change to odd
                ltr.set(i); // Set method to change value
                ltr.add(i); // to add
            }
        }
        System.out.println();
        System.out.println(al);
    }
}
