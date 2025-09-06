package LinkedlistByRaghav;

public class DisplayLL {
    public static class Node{
        int data;
        Node next;
        Node(int x){
            this.data=x;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(0);
        Node s=new Node(11);
        Node d=new Node(111);
        Node f=new Node(12);
        Node g=new Node(122);
        Node h=new Node(121);
        a.next=s;
        s.next=d;
        d.next=f;
        f.next=g;
        g.next=h;
        Node head=a;
        Node temp=a;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(head.data);
    }

}
