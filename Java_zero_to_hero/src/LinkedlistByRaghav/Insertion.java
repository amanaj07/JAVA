package LinkedlistByRaghav;

public class Insertion {
    public static class Node{
        int data;
        Node next;
        Node(int x){
            this.data=x;
        }
    }

    public static void main(String[] args) {
        Node a1=new Node(1);
        Node a2=new Node(2);
        Node a3=new Node(3);
        Node a4=new Node(4);
        Node a5=new Node(5);
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        System.out.println(a2.next);//LinkedlistByRaghav.Insertion$Node@8efb846
        System.out.println(a2.next.data);
        Node n1=new Node(10);
        System.out.println(n1.next);
        //we have to insert it between a2 and a3
        n1.next=a3;
        System.out.println(n1.next);//LinkedlistByRaghav.Insertion$Node@8efb846

        a2.next=n1;
        System.out.println(a2.next.data);
    }
}
