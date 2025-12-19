import java.util.* ;
public class CountDistElements {
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1} ;
    
        HashSet<Integer> hs = new HashSet<>() ;         //TC = O(n)
        for(int i=0 ; i<arr.length ; i++){
            hs.add(arr[i]) ;
        }
        System.out.println("The number of Distinct Elements is : "+hs.size());
    
    

        // Union & Intersection 
        int arr1[] = {7,3,9} ;
        int arr2[] = {6,3,9,2,9,4} ;

        HashSet<Integer> set = new HashSet<>() ;

        //Union
        for(int i=0 ; i<arr1.length ; i++){
            set.add(arr1[i]) ;
        }
        for(int i=0 ; i<arr2.length ; i++){
            set.add(arr2[i]) ;
        }
        System.out.println("Union = "+set.size());
        System.out.println(set);

        //Intersection 
        set.clear();
        for(int i=0 ; i<arr1.length ; i++){
            set.add(arr1[i]) ;
        }
        int count = 0 ;
        for(int i=0 ; i<arr2.length ; i++){
            if (set.contains(arr2[i])) {
                count++ ;
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]) ;
            }
        }

        System.out.println("\nIntersection = "+count);

        // System.out.println(union(arr1, arr2)) ;
        // System.out.println(intersection(arr1,arr2));
    }

/*
    public static int union(int arr1[], int arr2[]){
            HashSet<Integer> hs = new HashSet<>() ;

            for(int i=0 ; i<arr1.length ;i++){
                hs.add(arr1[i]) ;
            }
            for(int i=0; i<arr2.length ;i++){
                hs.add(arr2[i]) ;
            }
            // for(int i=0 ; i<arr1.length ; i++){
            //     if (!hs.contains(arr1[i])) {
            //         hs.add(arr1[i]) ;
            //     }
            // }                                            Me Chutiya sarkha itka lamba try krt baslo SET madhe same elements check kraych kaam naste 
            // for(int i=0 ; i<arr2.length ; i++){
            //     if (!hs.contains(arr2[i])) {
            //         hs.add(arr2[i]) ;
            //     }
            // }
            int size = hs.size() ;
            return size ;
    }
    
    public static int intersection(int arr1[] , int arr2[]){
        HashSet<Integer> hs = new HashSet<>() ;
        
        for(int i=0 ; i<arr1.length ; i++){
            hs.add(arr1[i]) ;
        }

        for(int i=0; i<arr2.length ; i++){                  Wrong Code 
            if (hs.contains(arr2[i])) {
                continue; 
            }else{
                hs.remove(arr2[i]) ;
            }
        }

        return hs.size() ;
    } */

}
