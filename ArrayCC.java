public class ArrayCC {

 /*    public static int linearsearch(int numbers[] , int key ){
        
        for(int i=0; i<numbers.length ;i++){
            if(numbers[i]==key){
                return i ;
            }
        }
         return -1 ;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = linearsearch(numbers, key) ;

        if(index==-1){
            System.out.println("Not Found");
        }
        System.out.println("Key is at index : "+index);
    }
    */
    
    
   /* public static int getLarget(int numbers[]){
        int Largest = Integer.MIN_VALUE ; //-infinity (lowest integer value)
        int Smallest = Integer.MAX_VALUE ; //-infinity (highest integer value)

        for(int i=0 ; i<numbers.length ; i++){
            if(Largest < numbers[i]){
                Largest = numbers[i] ;
            }
            if(Smallest > numbers[i]){
                Smallest = numbers[i] ;
            }
        }
        System.out.println("The Smallest value in the array is : "+Smallest);
        return Largest ;
    }
 */

 /*   public static int BinarySearch(int numbers[] , int key){
        int start= 0 ;
        int end = numbers.length - 1 ;

        while(start <= end){
            int mid = (start+end)/2 ;

            //comparisons 
            if(numbers[mid] == key){   //found value 
                return mid ;
            }
            else if(numbers[mid] < key){  // move to right 
                start = mid+1 ;
            }
            else{  // move in left direction 
                end = mid-1 ;
            }
        }
        return -1 ;
    }    */

   /* public static void reverse(int numbers[]){
        int first=0 , last= numbers.length-1 ;

        while(first < last){
            //swap
            int temp = numbers[last] ;
            numbers[last] = numbers[first] ;
            numbers[first] = temp ;
        
            first++ ;
            last-- ;

        }
    }  */

    public static void Pairs(int numbers[]){
        int totpairs = 0 ;
        for(int i=0 ; i< numbers.length ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                System.out.print(" ("+numbers[i]+","+numbers[j]+") ");
                totpairs++ ;
            }
            System.out.println();
        }
        System.out.println("Total no. of Pairs : "+totpairs);
    }

    public static void PrintSubArray(int numbers[]){
            int total = 0 ;
        for(int i=0 ; i<numbers.length ; i++){    //i = start 
            for(int j=i ; j<numbers.length ; j++){    //j = end 
                for(int k=i ;k<=j ; k++){           //To print only 
                    System.out.print(numbers[k]+" ");  //subarray
                }
                total++ ;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total no. of subarrays =  "+total);
    }

    public static void main(String args[]){

        int numbers[] = {0,1,2,3,4,5,6};
      //  int key = 2 ;
      //  System.out.println("Index for key is : "+BinarySearch(numbers,key));    
      /*  reverse(numbers);
        //print array 
        for(int i=0 ; i < numbers.length ; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
     */
    // Pairs(numbers);
        PrintSubArray(numbers);

    }
}
