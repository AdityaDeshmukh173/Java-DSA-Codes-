public class SegTreeMinMaxEle {
    
    static int tree[] ;
    public static void init(int n){
        tree = new int[4*n] ;
    }

    public static void buildST(int i, int si, int sj, int arr[]){           // TC = O(n)
        if (si == sj) {
            tree[i] = arr[si] ;
            return ;
        }

        int mid  = (si + sj)/2 ;        // si+(sj-si)/2
        buildST(2*i+1, si, mid, arr);
        buildST(2*i+2, mid+1, sj, arr);

        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]) ;
    }

    public static int getMax(int arr[], int qi, int qj){                    // For getMin replace max by min and Int.MinVal -> MaxVal
        int n = arr.length ;
        return getMaxUtil(0, 0, n-1, qi, qj) ;
    }   

    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){        // TC = O(log n)
        if (si > qj || sj < qi) {           // No Overlpa
            return Integer.MIN_VALUE ;
        }else if (si >= qi && sj <= qj) {       // Complete Overlap
            return tree[i] ;
        }else{                          // Partial Overlap 
            int mid = (si+sj)/2 ;
            int leftAns = getMaxUtil(2*i+1, si, mid, qi, qj) ;
            int rightAns = getMaxUtil(2*i+2, mid+1, sj, qi, qj) ;
            return Math.max(leftAns, rightAns) ;
        }
    }

    public static void update(int arr[], int idx, int newVal){
        int n = arr.length ;
        arr[idx] = newVal ;
        updateUtil(0, 0, n-1, idx, newVal);
    }

    public static void updateUtil(int i, int si, int sj, int idx, int newVal){          // TC = O(log n)
        if (idx < si || idx > sj) {
            return ;
        }
        if (si == sj) {
            tree[i] = newVal ;
        }
        if (si != sj) {
            tree[i] = Math.max(tree[i], newVal) ;
            int mid = (si + sj)/2 ;
            updateUtil(2*i+1, si, mid, idx, newVal);
            updateUtil(2*i+2, mid+1, sj, idx, newVal);    
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,8,-1,2,17,1,3,2,4} ;
        int n = arr.length ;

        init(n);
        buildST(0, 0, n-1, arr);
        for(int i=0; i<tree.length; i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

        int max = getMax(arr, 2, 5) ;
        System.out.println(max);

        update(arr, 2, 20);
        int max2 = getMax(arr, 2, 5) ;
        System.out.println(max2);
    }
}
