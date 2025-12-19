import java.util.LinkedList;

public class LLJCk {
    public static void main(String arg[]){
        //create 
        LinkedList<Integer> ll = new LinkedList<>(); 
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        System.out.println(ll);
        //remove 
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}
