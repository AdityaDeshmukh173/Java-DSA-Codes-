public class ShortestPath {
    
    public static void main(String args[]){
        String path = "WNEENESENNN" ;

        System.out.println(getshpath(path));
    }

    public static float getshpath(String path){      //TC = O(n)
        int x=0 , y=0 ;
        
        for(int i=0 ; i<path.length() ; i++){
            char direc = path.charAt(i) ;
            if(direc == 'E'){
                x++ ;
            }
            else if(direc == 'W'){
                x-- ;
            }
            else if(direc == 'N'){
                y++ ;
            }
            else if(direc == 'S'){
                y-- ;
            }
            else{
                System.out.println("Invalid Direction !!");
            }
        }

        int sum = x*x + y*y ;
        float shortest = (float)Math.sqrt(sum) ;

        return shortest ;
    }
}
