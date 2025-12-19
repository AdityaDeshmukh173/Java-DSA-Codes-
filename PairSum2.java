import java.util.*;

public class PairSum2 {

    public static boolean paisum2(ArrayList<Integer> list , int target){
        int bp = -1 ;
        int n = list.size();
        for(int i=0 ; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){    //Breaking Point 
                bp = i;
                break ;
            }
        }
        int lp = bp+1 ;  //Smallest Element 
        int rp = bp ;  //Largest Element 

        while(lp != rp){
            //case 1 
            if(list.get(lp) + list.get(rp) == target ){
                return true;
            }
            //case 2
            if(list.get(lp) + list.get(rp) < target ){
                lp = (lp+1)%n ;
            }
            //case 3
            else{
                rp = (n+rp-1)%n ;
            }
        }
        return false ;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16 ;

        System.out.println(paisum2(list, target));
    }
}
