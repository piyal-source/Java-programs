package myLinkedList;

public class  MyLinkedList<T> {
    Node<T> head;

    public void print() {
        Node<T> temp = head;
        while(temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size() {
        int count = 0;
        Node<T> temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }

    public boolean add(T value) {
        if(value == null) {
            return false;
        }
        Node<T> newNode = new Node<>(value);
        if(head == null) {
            head = newNode;
        }
        else {
            Node<T> temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return true;
    }

    public boolean add(int index, T value) throws IndexOutOfBoundsException {
        if(index > size() || value == null) {
            throw new ArrayIndexOutOfBoundsException("Index out of bound exception");
        }
        else {
            Node<T> newNode = new Node<>(value);
            if(index == 0) {
                newNode.next = head;
                head = newNode;
            }
            else {
                int countIndex = 1;
                Node<T> temp = head;
                while(countIndex < index) {
                    temp = temp.next;
                    countIndex++;
                }
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
        return true;
    }

    public void addAll(MyLinkedList<T> newList) {
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newList.head;
    }

    public void clear() {
        head = null;
    }

    public boolean contains(T value) {
        Node<T> temp = head;
        while(temp != null) {
            if(temp.data == value)  {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(T value) {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            if(temp.data == value) {
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1;
    }

    public int lastIndexOf(T value) {
        int count = 0;
        int index = -1;
        Node<T> temp = head;
        while (temp != null) {
            if(temp.data == value) {
                index = count;
            }
            count++;
            temp = temp.next;
        }
        return index;
    }

    public boolean remove(T value) {
        if(isEmpty()) {
            return false;
        }
        if(head.data == value) {
            head = head.next;
            return true;
        }
        Node<T> temp = head;
        while(temp.next != null) {
            if(temp.next.data == value) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T remove(int index) throws IndexOutOfBoundsException {
        if(index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bound exception");
        }
        Node<T> temp = head;
        if(index == 0) {
            head = head.next;
            return temp.data;
        }
        int countIndex = 1;
        while(countIndex != index) {
            temp = temp.next;
            countIndex++;
        }
        temp.next = temp.next.next;
        return temp.data;
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if(index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bound exception");
        }
        int count = 0;
        Node<T> temp = head;
        while(count < index) {
            temp = temp.next;
            count++;
        }
        return temp.data;
    }

    public void set(int index, T value) throws IndexOutOfBoundsException {
        if(index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bound exception");
        }
        int count = 0;
        Node<T> temp = head;
        while(count < index) {
            temp = temp.next;
            count++;
        }
        temp.data = value;
    }

    public Object[] toArray() {
        int size = size();
        Object[] arr = new Object[size];
        Node<T> temp = head;
        for(int i=0; i<size; i++) {
            arr[i] = temp.data;
            temp = temp.next;
        }
        return arr;
    }

    public T[] toArray(T[] arr) {
        Node<T> temp = head;
        int i = 0;
        while(temp != null) {
            arr[i++] = temp.data;
            temp = temp.next;
        }
        return arr;
    }
}