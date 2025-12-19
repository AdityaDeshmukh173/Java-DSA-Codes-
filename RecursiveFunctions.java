public class RecursiveFunctions {
    public static void recursdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        recursdec(n-1);
    }

    public static void recursinc(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        recursinc(n-1);
        System.out.print(" "+n);
    }

    public static int recfactorial(int n){         //TC =  O(n)    SpaceC = O(n)
        int fact =1 ;
        if(n==0){
            return 1;
        }
        fact = n*recfactorial(n-1);
        
        return fact ;
    }

    public static int naturalsum(int n){
        if(n==1){
            return 1;
        }
        int sum ;
        sum = n + naturalsum(n-1);
        return sum ;
    }

    public static int fiboseries(int n){      //TC = exponential 0(2^n)       SC = O(n)         very bad TC
        if(n==0 || n==1){
            return n;
        }
        int sum = fiboseries(n-1)+ fiboseries(n-2) ;
        return sum;
    }

    public static boolean issorted(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return issorted(arr, i+1) ;
    }

    public static int FirstOccrns(int arr[], int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i ;
        }
        return FirstOccrns(arr, key, i+1) ;
    }
    
    public static int LastOccrns(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = LastOccrns(arr , key,i+1);
        if(isfound == -1 && arr[i] == key){               
            return i;
        }
        return isfound ;
    }

    public static int xton(int x, int n){       //TC= O(n)  
        if(n==0){           //for x==1 condition wont required 
            return 1;        
        }
        return x*xton(x, n-1);
    }

    public static int optimxton(int x, int n){
        if(n==0){
            return 1;
        }
//        int halfpowsq = optimxton(x, n/2)*optimxton(x, n/2) ;           // TC = O(n)    func is called 2 times 
        int halfpow = optimxton(x, n/2);
        int halfpowsq = halfpow * halfpow ;      //func is called 1 time only    TC = O(log n)
        if(n%2 != 0){
            halfpowsq = x*halfpowsq ;
        }
        return halfpowsq;
    }


    public static void main(String[] args) {
        int n = 15;
        recursdec(n);
        recursinc(n);
        System.out.println();
        System.out.println(recfactorial(n));
        System.out.println(naturalsum(n));
        System.out.println(fiboseries(n));

        int arr[] = {1,2,3,4,5,6};
        System.out.println(issorted(arr, 0));
        System.out.println(FirstOccrns(arr, 4, 0));
        System.out.println(LastOccrns(arr, 2, 0));
        System.out.println(xton(2,10 ));
        System.out.println(optimxton(2, 10));
    }
}
