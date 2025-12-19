import java.util.*; 

public class MaXActivities {    
    public static void main(String[] args) {            // sorted : O(n)        unsorted : O(nLog n)
        int start[] = {1,3,0,5,8,5} ;
        int end[]   = {2,4,6,7,9,9};   

        //Sorting if not done already 
        int activities[][] = new int[start.length][3] ;
        for(int i=0 ; i<start.length ; i++){
            activities[i][0] = i ;
            activities[i][1] = start[i] ;
            activities[i][2] = end[i] ;
        }
        // Lambda Function -> Short Form 
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));         //This step will sort the complete array automatically

        // end time basis sorted 
        int maxAct = 0 ;// count 
        ArrayList<Integer> ans = new ArrayList<>() ;

        //1st act
        maxAct = 1 ;
        ans.add(activities[0][0]) ;
        int lastendtime = activities[0][2] ;
        for(int i =1 ; i<end.length ; i++){
            if(activities[i][1] >= lastendtime){
                //activity select
                maxAct++;
                ans.add(activities[i][0]) ;
                lastendtime = activities[i][2] ;
            }
        }

        System.out.println("No of max activities = "+maxAct);
        for(int i = 0 ; i<ans.size() ;i++){
            System.out.print(" A"+ans.get(i));
        }
        System.out.println();
    }
}
