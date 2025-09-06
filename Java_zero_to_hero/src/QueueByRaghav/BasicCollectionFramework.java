package QueueByRaghav;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicCollectionFramework {
    public static void main(String[] args) {
        // Queue<Integer> q=new Queue<>();
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q1=new ArrayDeque<>();
        //in dono triko se hum collection framework wali queue  ko acess  kr skte ha9o
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        q.remove();
        System.out.println(q.remove());
        q.poll();//use for remove
        System.out.println(q.element());
        //q.element() hume top ka elemnt deta hai or yaha pr hum elemnt ki jghe peek bhi use kr skte hai
        System.out.println(q.size());

        System.out.println(q);
        System.out.println(q.element());

    }
}
