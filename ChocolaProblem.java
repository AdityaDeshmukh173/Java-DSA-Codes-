import java.util.*;

public class ChocolaProblem {
    
    public static void main(String[] args) {
        int n= 4 , m = 6 ;
        Integer VerCost[] = {2,1,3,1,4} ;    //(m-1)
        Integer HorCost[] = {4,1,2}; //(n-1)
    
        Arrays.sort(VerCost , Collections.reverseOrder());
        Arrays.sort(HorCost , Collections.reverseOrder());
    
        int h=0 , v=0 ;     // no. of hor and ver cuts 
        int hp =1 , vp=1 ;  //single complete chocolate 
        int cost = 0 ;

        while( h < HorCost.length && v < VerCost.length){
            if(VerCost[v] <= HorCost[h]){       // Horizontal cut
                cost += (HorCost[h] * vp);
                hp++ ;
                h++ ;
            }else{          // Vertical Cut
                cost += (VerCost[h] * hp);
                vp++ ;
                v++;
            }
        }
        while( h < HorCost.length){
            cost += (HorCost[h]*vp) ;
            hp++;
            h++;
        }
        while( v < VerCost.length){
            cost += (VerCost[v]*hp);
            vp++;
            v++;
        }

        System.out.println("Min cost of Cuts = "+cost);
    }
}
