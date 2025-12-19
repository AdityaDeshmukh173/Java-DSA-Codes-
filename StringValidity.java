import java.util.* ;
public class StringValidity {
    
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>() ;

        for(int i = 0 ; i< str.length() ; i++){
            char ch = str.charAt(i) ;
            
            if(ch == '(' || ch == '{' || ch == '['){        //Opening 
                s.push(ch) ;
            }else{          // Closing 
                if(s.isEmpty()){
                    return false ;
                }
                if((s.peek() == '(' && ch == ')') || 
                (s.peek() == '{' && ch == '}') ||
                (s.peek()== '[' && ch == ']') ) {
                    s.pop() ;
                }
                else{
                    return false ;
                }
            }
        }
        if(s.isEmpty()){
            return true ;
        }else{
            return false ;
        }
    }

    public static boolean isDuplicate (String str){             //O(n)
        Stack<Character> s = new Stack<>();

        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i) ;
            // Closing                      if not closing then by default it will be a char to add
            if(ch == ')'){
                int count= 0 ;
                while( /*!s.isEmpty() &&*/ s.peek() != '('){            // we can remove this condition logically 
                    s.pop() ;
                    count++ ;
                }
                if(count < 1){
                    return true ;       //Duplicate 
                }else{
                    s.pop() ;       //Opening Pair 
                }
            }else{
                // Opening Operator or Operand
                s.push(ch) ;
            }
        }
        return false ;
    }

    // Height in Histogram !! 
    public static void maxArea(int arr[]){              // TC = O(n) -  Optimized Code
        int maxArea = 0 ;
        int nsl[] = new int[arr.length] ;
        int nsr[] = new int[arr.length] ;

        //Next Smaller Right
        Stack<Integer> s = new Stack<>() ;
        for(int i=arr.length-1 ; i>= 0 ;i--){
            while(!s.isEmpty()  && arr[s.peek()]>= arr[i] ){
                s.pop() ;
            }
            if(s.isEmpty()){
                nsr[i] = arr.length ;
            }else{
                nsr[i] = s.peek() ;
            }
            s.push(i) ;
        }

        //Next Smaller Left 
        s = new Stack<>() ;

        for(int i=0 ; i< arr.length ; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop() ;
            }
            if(s.isEmpty()){
                nsl[i] = -1 ;
            }else{
                nsl[i] = s.peek() ;
            }
            s.push(i) ;
        }

        // Current Area : Width = j-i-1 = nsr[i] - nsl[i] - 1  
        
        for(int i=0 ; i<arr.length ; i++){
            int height = arr[i] ;
            int width = nsr[i] - nsl[i] - 1 ;
            
            int currArea = height * width ;
            maxArea = Math.max(maxArea, currArea) ;
        }
        System.out.println("Maximum Area in Histogram = "+maxArea);
    }


    public static void main(String[] args) {
        // String str = "({})[]" ;                 //True
        // System.out.println(isValid(str));
    
        String str1 = "((a+b))" ;       //True 
        String str2 = "(a+b)" ;         //False
        
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));

        int arr[] = {2,1,5,6,2,3} ;
        maxArea(arr);
    }
}
