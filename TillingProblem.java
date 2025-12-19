public class TillingProblem{
    public static void main(String args[]){
        System.out.println(tillingproblem(3));
        String str = "appnnacollege" ;
        removeduplcates(str, 0, new StringBuilder(""), new boolean[26]);
        System.out.println(friendspairing(3));
        printbinstr(4, 0,"");
    }

    public static int tillingproblem(int n){     //2xn is floar size
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //Kaam  to choose
        //Vertical tiles
        int verticaltiles = tillingproblem(n-1);
        //horizontal tiles
        int horizontaltiles = tillingproblem(n-2);

        int totalways = verticaltiles + horizontaltiles ;
        return totalways;                   
        //return tillingproblem(n-1)+tillingproblem(n-2);
    }   

    public static void removeduplcates(String str, int idx , StringBuilder newString, boolean map[]){
        if(idx == str.length()){
            System.out.println(newString);
            return ;
        }  //Kaam

        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){
            //Duplicate 
            removeduplcates(str, idx+1, newString, map);
        }else{
            map[currchar-'a'] = true ;
            removeduplcates(str, idx+1, newString.append(currchar), map);
            
        }

    }

    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }           //Choice 
        // //single
        // int fnm1 = friendspairing(n-1);
        // //pair
        // int fnm2 = friendspairing(n-2);
        // int pairways = (n-1)*fnm2 ;

        // int totways = fnm1+pairways ; 
        // return  totways;
        return friendspairing(n-1)+ (n-1)*friendspairing(n-2) ;
    }

    public static void printbinstr(int n, int lastplace , String str){  
        //Base 
        if(n==0){
            System.out.println(str);
            return;
        }
        // //Kaam
        printbinstr(n-1, 0, str+"0");
        if(lastplace == 0){
            printbinstr(n-1, 1, str+"1");
        }
    }
}