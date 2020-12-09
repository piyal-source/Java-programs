package myQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        MyQueue<Integer> q = new MyLinkedList<>();
        System.out.println(q.poll());
        System.out.println(q.add(5));
        q.add(8);
        q.add(2);
        System.out.println(q.element());
        q.add(10);
        q.print();
        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}