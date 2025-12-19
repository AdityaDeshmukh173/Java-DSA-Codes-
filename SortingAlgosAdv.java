public class SortingAlgosAdv {
    public static void main(String args[]){
        int arr[] = {4,2,5,3,9,7,35,15,384,483,3,8,4848,39,02};              

        mergesort(arr, 0, arr.length-1);
        printarr(arr);
        quicksort(arr, 0, arr.length-1);   
        printarr(arr);

        int tidx = search(arr, 15, 0, arr.length-1);
        System.out.println(tidx);
    }

    public static void printarr(int arr[]){
        for(int i=0 ; i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei ){
        if(si>=ei){
            return ;
        }
        //kaam 
        int mid = si + (ei - si)/2 ;   //(si+ei)/2
        mergesort(arr, si, mid);        //Left Part 
        mergesort(arr, mid+1, ei);      //Right Part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        //left=(0,3)=4   right=(4,6)=3 -> 6-0+1
        int temp[] = new int[ei-si+1]; 
        int i = si ; //iterator for left part 
        int j = mid+1; //iterator for right part 
        int k = 0; //iterator for temp 

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i] ;
                i++ ; //k++ ;
            }else{
                temp[k] = arr[j];
                j++ ; //k++;
            }
            k++;
        }
        //Left Part remaining 
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //Right Part remaining 
        while(j <= ei){
            temp[k++] = arr[j++];
        }
        //Copy Temp To Original 
        for(k=0,i=si ; k<temp.length ; k++,i++){
            arr[i] = temp[k] ;
        }
    }

    public static void quicksort(int arr[], int si, int ei){
        if(si >= ei){
            return;             //Base Case
        }
        //Last Element 
        int pidx = partition(arr,si,ei);
        quicksort(arr, si, pidx-1);  //Left
        quicksort(arr, pidx+1, ei);  //Right
    } 

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei] ;
        int i = si-1 ;    //To make place for elements smaller than pivot 

        for(int j=si ; j<ei ; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i] ;
                arr[i] = temp ;
            }
        }
        i++;
        int temp = pivot ;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i ;  //pivot index
    }

    public static int search(int arr[], int target, int si, int ei){    //Modifiead Binary Search !!
        //Base case                                          Sorted & Rotated Array Question 
        if(si > ei){
            return -1 ;//Elemant dont exist
        }
        //kaam 
        int mid = si+(ei-si)/2 ;

        //case found
        if(arr[mid] == target){
            return mid ;
        }
        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a: Left 
            if(arr[si] <= target && target <= arr[mid] ){
                return search(arr, target, si, mid-1);
            }else{
                //case b: Right 
                return search(arr, target, mid+1, ei);
            }
            
        }
        //mid on L2
        else{
            //case c: Right 
            if(arr[mid] <= target && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }else{
                //case d: Left 
                return search(arr, target, si, mid-1);
            }
        }

    }
}
 

