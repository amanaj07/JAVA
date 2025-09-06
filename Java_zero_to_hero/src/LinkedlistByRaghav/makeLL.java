package LinkedlistByRaghav;



public class makeLL {
    public static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        System.out.println(a.next);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(53);
        Node e=new Node(52);
        //now we have to linkinking the nodes
        a.next=b;
        System.out.println(a.next);//LinkedlistByRaghav.makeLL$Node@8efb846
        System.out.println(b);//LinkedlistByRaghav.makeLL$Node@8efb846
        //both are same
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        System.out.println(c.data);
        System.out.println(a.next.next.data);//now we can acees the c by a



    }


}
