package myStackLinkedList;

import myLinkedList.MyLinkedList;
import java.util.EmptyStackException;

public class MyStack<T> {
    MyLinkedList<T> ll = new MyLinkedList<>();

    public void push(T value) {
        if(ll.isEmpty()) {
            ll.add(value);
        }
        else {
            ll.add(0, value);
        }
    }

    public T pop() throws EmptyStackException {
        if(ll.isEmpty()) {
            throw new EmptyStackException();
        }
        return ll.remove(0);
    }

    public T peek() throws EmptyStackException {
        if(ll.isEmpty()) {
            throw new EmptyStackException();
        }
        return ll.get(0);
    }

    public int search(T value) {
        int index = ll.indexOf(value);
        if(index == -1) {
            return -1;
        }
        return index+1;
    }

    public boolean empty() {
        return ll.isEmpty();
    }

    public void print() {
        ll.print();
    }
}
