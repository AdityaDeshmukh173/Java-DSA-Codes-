import java.util.* ;

public class HashMapCodeFromScratch {

    static class HashMap<K,V> {     // K,V -> Generic (it will work for String, Integer, Boolean all)
        private class Node {
            K key ;
            V value ;
            public Node(K key, V value){
                this.key = key ;
                this.value = value ;
            }
        }
        
        private int n ;      // n    total no. of nodes         size 
        private int N ;
        private LinkedList<Node> buckets[] ;    // N = buckets.lenght            same as int arr[]   here datatype is LL ie. its an array of LL
        private Object[] buckets;
    
        @SuppressWarnings("unchecked")      //Its actually to suppres/hide the Warnigs in the code but ig didnt worked well !! 
        public HashMap(){
            this.N = 4 ;
            this.buckets = new LinkedList[4] ;
            for(int i=0 ; i<4 ; i++){
                this.buckets[i] = new LinkedList() ;        //LinkedList<>() ;
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode() ;
            return Math.abs(hc)% N ; //Convert -ve to +ve value 
        }

        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi] ;
            int di = 0;

            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i) ;
                if (node.key == key) {
                    return di ;
                }
                di++ ;
            }
            return -1 ;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets ;
            buckets = new LinkedList[2*N] ;
            N = 2*N ;
            for(int i=0 ; i<buckets.lenght ; i++){
                buckets[i] = new LinkedList() ;
            }
            
            //Nodes -> add in new Bucket 
            for(int i=0 ; i<oldBuck.lenght ;i++){
                LinkedList<Node> ll = oldBuck[i] ;
                for(int j=0 ; j<ll.size() ; j++){
                    Node node = ll.remove() ;
                    put(node.key, node.value);
                }
            } 
        }

        public void put(K key, V value){                //TC = O(lambda) -> O(1)
            int bi = hashFunction(key) ; // 0 to size-1 ie. 0 - 3         // Bucket Index
            int di = SearchInLL(key, bi) ;       // Data Index      -> Valid or -1

            if (di != -1) {
                Node node = buckets[bi].get(di) ;       // Array Index ->> Bucket -->> LL -->> Key 
                node.value = value ;
            }else{
                buckets[bi].add(new Node(key, value)) ;
                n++ ;
            }

            double lambda = (double) n/N ;
            if (lambda > 2) {       // Greater than Threshold
                rehash() ;
            } 
        }

        public boolean containsKey(K key){              //Copied whole Put funcion      // TC = O(1)            
            int bi = hashFunction(key) ; 
            int di = SearchInLL(key, bi) ;       

            if (di != -1) {
                return true ;
            }else{
                return false ;
            }
        }

        public V remove(K key){                         // TC = O(1)
            int bi = hashFunction(key) ; // 0 to size-1 ie. 0 - 3         // Bucket Index
            int di = SearchInLL(key, bi) ;       // Data Index      -> Valid or -1

            if (di != -1) {
                Node node = buckets[bi].remove(di) ;
                n-- ;   // size reduce        
                return node.value ; 
            }else{
                return null ;
            }
        }

        public V get(K key){                //Copied put fun again          // TC = O(1)
            int bi = hashFunction(key) ; 
            int di = SearchInLL(key, bi) ;     

            if (di != -1) {
                Node node = buckets[bi].get(di) ;      
                return node.value ;
            }else{
                return null ;
            }
       }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0 ; i<buckets.lenght ; i++){
                LinkedList<Node> ll = buckets[i] ;
                for (Node node : ll) {
                    keys.add(node.key) ;
                }
            }
            return keys ;
        }

        public boolean isEmpty(){
            return n == 0 ;
        }
    }

    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>() ;
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        
        ArrayList<String> keys = hm.keySet() ;
        for (String key : keys) {
            System.out.println(key); 
        }

        System.out.println(hm.get("India")) ;
        System.out.println(hm.remove("India")) ;
        System.out.println(hm.get("India")) ;  

    }
}