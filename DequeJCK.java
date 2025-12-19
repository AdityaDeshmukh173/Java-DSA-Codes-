import java.util.*;
import java.util.LinkedList;
public class DequeJCK {
    public static void main(String[] args) {
        Deque<Integer> deq = new LinkedList<>();
        
        deq.addFirst(1);
        deq.addFirst(2);
        deq.addLast(3);
        deq.addLast(4);
        System.out.println(deq);
        deq.removeFirst();
        System.out.println(deq);
        deq.removeLast();
        System.out.println(deq);

        System.out.println(deq.getFirst());
        System.out.println(deq.getLast());


        // Stack 
        Stack s = new Stack() ;
        s.push(1) ;
        s.push(2) ;
        s.push(3) ;
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        // Queue 
        Queue q = new Queue() ;
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }


    static class Stack{
        Deque<Integer> deque = new LinkedList<>() ;

        public void push(int data){
            deque.addLast(data) ;
        }

        public int pop(){
            return deque.removeLast();
        } 

        public int peek(){
            return deque.getLast();
        }
    }

    static class Queue{
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data) ;
        }

        public int remove(){
            return deque.removeFirst() ;
        }

        public int peek(){
            return deque.getFirst();
        }
    }
}