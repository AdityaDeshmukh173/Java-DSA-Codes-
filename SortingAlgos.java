
public class SortingAlgos {
    
    public static void BubbleSort(int arr[]){
        for(int turn=0 ; turn<arr.length-1 ; turn++){
            for(int j=0 ; j<arr.length-1-turn ; j++){
                if(arr[j]>arr[j+1]){
                    // for swapping 
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
    }

    public static void SelectionSort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            int MinPos = i; 
            for(int j=i+1 ; j<arr.length ;j++){
                if(arr[MinPos] > arr[j]){
                    MinPos = j ;
                }
            }
            //swap 
            int temp = arr[MinPos] ;
            arr[MinPos] = arr[i] ;
            arr[i] = temp ;
        }
    }

    public static void InsertionSort(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            int curr= arr[i] ;
            int prev = i-1 ;
            //Finding out the correct position for insertion 
            while(prev >=0 && arr[prev]> curr){
                arr[prev+1] = arr[prev] ;
                prev-- ;
            }
            //Insertion 
            arr[prev+1] = curr ;

        }
    }

    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE ;
        for(int i=0 ; i<arr.length ; i++){
            largest = Math.max(largest, arr[i]) ;
        }
        
        int count[] = new int [largest+1] ;
        for(int i=0 ; i<arr.length ; i++){
            count[arr[i]] ++ ;
        }

        //Sorting 
        int j = 0; 
        for(int i=0 ; i<count.length ; i++){
            while(count[i] > 0){
                arr[j] = i ;
                j++ ;
                count[i]-- ;
            }
        }
    }

    public static void PrintArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    

    public static void main(String args[]){
        int array[] = {3,5,1,4,2 , 7,9,6,8} ;
        //BubbleSort(array);
        //SelectionSort(array);
        //InsertionSort(array);
        //Arrays.sort(array , 0 , 4);
        CountingSort(array);
        PrintArr(array);
    }
}
