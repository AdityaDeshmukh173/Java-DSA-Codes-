import java.util.* ;

public class StackQues {
    
    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data) ;
            return ; 
        }
        int top = s.pop() ;
        pushAtBottom(s, data);
        s.push(top) ;
    }

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();

        int idx = 0 ;
        while(idx < str.length()){
            s.push(str.charAt(idx)) ;
            idx++ ;
        }

        StringBuilder result = new StringBuilder("") ;
        while(!s.isEmpty()){
            char curr = s.pop() ;
            result.append(curr) ;
        }
        return result.toString() ;
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int top = s.pop() ;
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void stockSpan(int[] Stock, int[] Span){
        Stack<Integer> s = new Stack<>() ;
        Span[0] = 1 ;
        s.push(0) ;     //index 0 

        for(int i =1; i<Stock.length ; i++){
            int currprice = Stock[i] ;
            while(!s.isEmpty() && currprice > Stock[s.peek()]){         //s.peek is index 
                s.pop() ;
            }
            if(s.isEmpty()){
                Span[i] = i+1 ;
            }else{
                int prevHigh = s.peek();
                Span[i] = i-prevHigh ;
            }
            s.push(i) ;
        }
    }   

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>() ;
        
        s.push(1);
        s.push(2);
        s.push(3);

        // pushAtBottom(s, 4);
        // while(!s.empty()){
        //     System.out.println(s.pop());
        // }
        // String str = "abcde" ;
        // String result = reverseString(str) ;
        // System.out.println(result);

        // reverseStack(s);
        // printStack(s);
    
        int Stock[] = {100, 80, 60, 70, 60, 85, 100};
        int Span[] = new int[Stock.length];
        stockSpan(Stock, Span);
            
        for(int i=0 ;i<Span.length ; i++ ){
            System.out.println(Span[i]+"");
        }
    }
}
