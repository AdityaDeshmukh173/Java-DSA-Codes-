import java.util.*;

public class JobSequencing {
    
    static class Job{
        int deadline ;
        int profit ;
        int id ; // 1(a), 2(b), 3(c)

        public Job(int i, int d, int p){
            deadline = d ;
            id = i ;
            profit = p ;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}} ;

        ArrayList<Job> jobs = new ArrayList<>();
        
        for(int i=0 ; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1])) ;
        }
        Collections.sort(jobs , (obj1 , obj2) -> obj2.profit - obj1.profit);
        // Descending Order sort 

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0 ;
        for(int i=0 ; i<jobs.size(); i++){
            Job curr = jobs.get(i) ;
            if(curr.deadline > time){
                seq.add(curr.id) ;
                time++ ;
            }
        }

        System.out.println("MX jOBS = "+seq.size());
        //Print Sequence 
        for(int i=0 ; i<seq.size() ;i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
