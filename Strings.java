import java.util.Scanner;

public class Strings {
    
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'} ;
        String str = "abcd" ;
        String str2 = new String("xyz@#1234") ;

        //Strings are IMMUTABLE 

        Scanner sc = new Scanner(System.in) ;
        
        String name ;
        //name = sc.next();       only 1 word before space 
        name = sc.nextLine();      //takes complete line 
        System.out.println(name);

        String Fullname = "Tony Stark"; 
        System.out.println(Fullname.length());
    
        String firstname = "Aditya" ;
        String lastname = "Deshmukh" ; 
        String mixed = firstname+" "+lastname ;
        System.out.println(mixed);
        System.out.println(mixed.charAt(0));

        printletters(str2);

        String pali = "racecar" ;
        System.out.println(palindromecheck(pali));
    }
    public static void printletters(String str){
        for(int i=0 ; i<str.length() ; i++){
            System.out.print(" "+str.charAt(i));
        }
        System.out.println();
    }

    public static boolean palindromecheck(String str){      // TC O(n)
        for(int i=0 ; i<str.length()/2 ; i++){
            int n = str.length() ;
            // Not a Palindrome
            if(str.charAt(i) != str.charAt(n-1-i)) {
                return false ;
            }
        }
        return true ;
    }

}
