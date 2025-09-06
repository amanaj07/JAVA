package LinkedlistByRaghav;

public class Basics {
    public static class Node{
        int data;
        Node next;
    }

    public static void main(String[] args) {
        Node x=new Node();
        Node y=new Node();

        System.out.println(x.data);
        System.out.println(x);

        System.out.println(x.next);
        x.data=5;
        x.next=y;
        y.data=6;
        System.out.println(y.data);
        System.out.println(x.next);
        System.out.println(x.data);
        System.out.println(y.next);


    }
}
