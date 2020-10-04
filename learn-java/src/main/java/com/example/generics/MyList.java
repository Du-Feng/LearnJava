package com.example.generics;

import java.util.Iterator;

/**
 * Provides an example how to implement Iterable interface.
 *
 * <p>From the point of view of implementation:</p>
 * <ul>
 *     <li><p>If the Iterator class is implemented as an inner class,
 *     we can simply use {@code this} keyword (e.g. cursor = CustomDataStructure.this.element)
 *     to access the desired element</p></li>
 *     <li><p>If the Iterator class is implemented as a separate class,
 *     we can pass this object of the data structure to the iterator class constructor
 *     as demonstrated in the example below.</p></li>
 * </ul>
 *
 * @author Feng Du
 * @version 1.0
 * @see <a href="https://www.geeksforgeeks.org/java-implementing-iterator-and-iterable-interface/">https://www.geeksforgeeks.org/java-implementing-iterator-and-iterable-interface/</a>
 * for the complete instructions and code
 * @see MyListIterator MyListIterator implementing Iterator interface
 */
public class MyList<T> implements Iterable<T> {
    Node<T> head, tail;

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void add(T data) {
        Node<T> node = new Node<>(data, null);
        if (head == null) {
            tail = head = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    public Iterator<T> iterator() {
        return new MyListIterator<T>(this);
    }
}
