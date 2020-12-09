package myQueue;

import myLinkedList.Node;

public class MyLinkedList<T> implements MyQueue<T> {
    Node<T> front = null, rear = null;

    public boolean add(T value) {
        boolean enqueued = offer(value);
        return enqueued;
    }

    public boolean offer(T value) {
        if(value == null) {
            return false;
        }
        Node<T> newNode = new Node<T>(value);
        if(front == null) {
            front = newNode;
        }
        else if(front == rear) {
            front.next = newNode;
        }
        else {
            Node<T> temp = front;
            while(temp != rear) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        rear = newNode;
        return true;
    }

    public T remove() throws Exception {
        if(front == null) {
            throw new Exception("Empty queue");
        }
        return poll();
    }

    public T poll() {
        if(front == null) {
            return null;
        }
        T dequeued = front.data;
        front = front.next;
        return dequeued;
    }

    public T peek() {
        return front.data;
    }

    public T element() throws Exception {
        if (front == null) {
            throw new Exception("Empty queue");
        }
        return front.data;
    }

    public void print() {
        Node<T> temp = front;
        while(temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }
}
