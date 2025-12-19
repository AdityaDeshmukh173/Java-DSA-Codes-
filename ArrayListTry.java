import java.util.ArrayList;

import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;

import java.util.*;;

public class ArrayListTry {
    
    public static void main(String args[]){
        //Classname Objectname = new Classname();
        ArrayList<Integer> list = new ArrayList<>();        //Same as object initialization  
        ArrayList<String> list2 = new ArrayList<>();                //ArrayList is a part of Java Collection FrameWork 
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);        //Operation Add
        list.add(3);        // TC = O(1)
        list.add(4);
        list.add(5);

        list.add(2, 10);     // Add with Index    TC = O(n) 
        System.out.println(list);
        
        int element = list.get(2);      //Get Operation 
        System.out.println(element);          // TC = O(1)
        
        // list.remove(3);                 //Remove Operator
        // System.out.println(list);

        list.set(3, 10);        //Set Operator
        System.out.println(list);
    
        System.out.println(list.contains(1));      //Contains Element 
        System.out.println(list.contains(11));
        
        System.out.println(list.size());

        //To Print the ArrayList 
        for(int i=0 ; i<list.size() ; i++){
            System.out.print(" "+list.get(i));
        }
        System.out.println();

        //Print Reverse ArrayList                            Lec 24.4           //TC = O(n)
        for(int i=list.size()-1 ; i>=0 ; i--){
            System.out.print(list.get(i) +" ");
        }
        System.out.println();

        //Find Maximum in ArrayList                         Lec 24.5        //TC = O(n)
        int max = Integer.MIN_VALUE ;
        for(int i=0 ; i<list.size() ; i++){
        //     if(list.get(i) > max){
        //         max = list.get(i) ;
        //     }
            max = Math.max(max, list.get(i)) ; 
        }
        System.out.println("The max value is : "+max);

        //Swap 2 numbers in the list  given idx1= 1 idx2 = 3                    Lec 24.6
        ArrayList<Integer> li4 = new ArrayList<>();
        li4.add(1) ;
        li4.add(2) ;
        li4.add(3) ;
        li4.add(4) ;
        li4.add(5) ; 
        System.out.println(li4);
        swap(li4, 3, 4);
        System.out.println(li4);
    }   

    public static void swap(ArrayList<Integer> li4 ,int idx1 , int idx2){
        int temp = li4.get(idx1) ;
        li4.set(idx1, li4.get(idx2)) ;
        li4.set(idx2, temp) ;

    }
}
