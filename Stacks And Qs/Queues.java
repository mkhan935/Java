import java.util.PriorityQueue;

/**
 * Created by Mohammed M Khan on 1/2/2017.
 */
public class Queues {
    public static void main(String[] args) {
        //lets do a priority Q
        PriorityQueue<String> Q=new PriorityQueue<>();
        
        Q.offer("First");
        Q.offer("Second");
        Q.offer("Third");

        System.out.println(Q);

        System.out.println(Q.peek()); //calls the element with highest priority

        Q.poll(); //removes element with highest priority

        System.out.println(Q);

        System.out.println(Q.peek());


    }
}
