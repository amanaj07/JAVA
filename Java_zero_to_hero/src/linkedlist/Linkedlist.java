package linkedlist;

public class Linkedlist{
    public static void main(String[] args) {

        LLfunctionclass list =new LLfunctionclass();
        list.insertfirst(3);
        list.insertfirst(5);
        list.insertfirst(6);
        list.insertfirst(2);
        list.insertfirst(7);
        list.display();
        System.out.println("  the linked list afteradding the new value");
        list.insertlast(99);
        list.display();
        list.insertanyindex(100,3);
        System.out.println("after inserting at a new index");
        list.display();
    }
}