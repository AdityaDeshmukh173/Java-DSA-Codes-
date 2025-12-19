import java.util.ArrayList;
import java.util.Collections;

public class ArrayLTry2 {
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        Collections.sort(list);         //Ascending Order 
        System.out.println(list);
        
        //Descending Order 
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        // Comparator - fnx logic 
        // Collections.reverse(list);
        // System.out.println(list);

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        mainList.add(list);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3) ; list2.add(6) ;
        mainList.add(list2);

        System.out.println(mainList);

        for(int i=0 ; i<mainList.size(); i++){
            ArrayList<Integer> curr = mainList.get(i) ;             //To get 1 list at a time 
            for(int j=0 ; j<curr.size(); j++){
                System.out.print(" "+curr.get(j));
            }
            System.out.println();
        }

        System.out.println("For The Given Que in Tutorial : ");
        ArrayList<Integer> li1 = new ArrayList<>();
        ArrayList<Integer> li2 = new ArrayList<>();
        ArrayList<Integer> li3 = new ArrayList<>();
        for(int i=1 ; i<=5 ;i++){
            li1.add(i*1);       //1 2 3 4 5
            li2.add(i*2);       //2 4 6 8 10
            li3.add(i*3);       //3 6 9 12 15
        }

        mainList.clear();       //Explored Function
        System.out.println(mainList);
        mainList.add(li1);
        mainList.add(li2);
        mainList.add(li3);
        
        System.out.println(mainList);
        //Nested Loop for printing Lists 
        for(int i=0 ; i<mainList.size(); i++){
            ArrayList<Integer> curr = mainList.get(i);
            for(int j=0; j<curr.size(); j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
}
