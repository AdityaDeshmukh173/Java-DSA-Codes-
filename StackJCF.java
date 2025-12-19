import java.util.* ;
public class StackJCF {
    
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(1);
        stk.push(2) ;
        stk.push(3);
        stk.peek() ;
        while(!stk.empty()){
            System.out.println(stk.peek());
            stk.pop() ;
        }
    }
}
