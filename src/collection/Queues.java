package collection;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {
        Queue<Integer> q= new PriorityQueue<>();
        ArrayDeque<Integer> q2= new ArrayDeque<>();
        q.offer(5);
        q.offer(9);
        q.offer(78);

        q2.offer(9);
        q2.offerFirst(7);
        q2.offerFirst(6);

        System.out.println(q.peek());
        System.out.println(  q.poll());
        Iterator it= q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
