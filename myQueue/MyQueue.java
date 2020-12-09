package myQueue;

import myLinkedList.Node;

public interface MyQueue<T> {
    boolean add(T value);

    boolean offer(T value);

    T remove() throws Exception;

    T poll();

    T element() throws Exception;

    T peek();

    void print();
}
