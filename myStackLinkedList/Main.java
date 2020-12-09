package myStackLinkedList;

import myLinkedList.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(10);
        stack.push(20);
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.search(10));
    }
}
