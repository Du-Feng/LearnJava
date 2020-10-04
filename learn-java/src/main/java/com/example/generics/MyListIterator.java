package com.example.generics;

import java.util.Iterator;

/**
 * Provides an example how to implement Iterator interface.
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
 * @see MyList MyList implementing Iterable interface
 */
public class MyListIterator<T> implements Iterator<T> {
    Node<T> current;

    public MyListIterator(MyList<T> list) {
        current = list.getHead();
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
