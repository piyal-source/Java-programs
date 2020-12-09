package myLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("abc");
        ll.add(1,"lala");
        System.out.println(ll);

        MyLinkedList<String> myLL = new MyLinkedList<>();
        myLL.add("abc");
        myLL.add(1,"lala");
        myLL.remove(0);
        myLL.set(5, "ss");
        myLL.add("haha");
        myLL.add("abc");
        myLL.print();
        MyLinkedList<String> myLL1 = new MyLinkedList<>();
        myLL1.add("abc");
        myLL1.add(1,"lala");
        myLL.addAll(myLL1);
        myLL.print();
        System.out.println(myLL.size());
        System.out.println(myLL.get(3));
    }
}
