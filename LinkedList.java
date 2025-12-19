public class LinkedList {
    
    public static class Node{
        int data ;
        Node next ;

        public Node (int data){     //Constructors
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail ;
    public static int size ;

    public void addFirst(int data){
        //step 1 : create new node
        Node newNode = new Node(data);
        size++ ;
        if(head == null){
            head = tail = newNode ;
            return;
        }
        //step 2 : new node next = head
        newNode.next = head ;   //Linking

        //step 3 : head = new node 
        head = newNode ;
    }

    public void addLast(int data){
        Node newNode = new Node(data) ;
        size++;
        if(head == null){
            head = tail = newNode ;
            return ;
        }
        tail.next = newNode ;
        tail = newNode ;
    }

    public void print(){
        // if(head == null){               //Its Optional 
        //     System.out.println("LL is Empty !!");
        //     return;
        // }
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void addAtIdx(int idx, int data){
        if(idx == 0){
            addFirst(data); 
            return ;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head ;
        int i = 0 ;
        while(i <idx-1){
            temp = temp.next ;
            i++;
        }
        // i = idx-1 ; temp -> prev
        newNode.next = temp.next ;
        temp.next = newNode ;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty !!");
            return Integer.MIN_VALUE;
        }else if(size == 1 ){
            int val = head.data ;
            head = tail = null ;
            size--;
            return val ;
        }
        int val = head.data ;
        head = head.next ;
        size--;
        return val ;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is Empty !!");
            return Integer.MIN_VALUE ;
        } else if (size == 1 ){
            int val = head.data ;
            head = tail = null ;
            size--;
            return val;
        }
        // prev = size-2
        Node prev = head;
        for(int i=0 ;i<size-2; i++){
            prev = prev.next ;
        }
        int val = prev.next.data ; // tail.data
        prev.next = null ;
        tail = prev ;
        size--;
        return val ;
    }
    public int itrsearch(int key){      //O(n)
        Node temp = head ;
        int i=0; 
        while(temp != null){
            if(temp.data == key){   //Key found
                return i;
            }
             temp = temp.next ;
             i++ ;
        }
        return -1 ;     //Key not Found case
    }

    public int helperRecSearch(Node head, int key){         //TC = O(n)   SC = O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helperRecSearch(head.next, key) ;
        if(idx == -1){
            return -1 ;
        }
        return idx+1 ;
    }
    public int recSearch(int key){
        return helperRecSearch(head, key) ;
    }

    public void reverse(){
        Node prev = null ;
        Node curr = tail = head  ;
        Node next ;
        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }
        head = prev ;
    }

    public void deletenthNodefromEnd(int n){
        int sz = 0 ;            
        Node temp = head ;
        while(temp != null){            //calculate size 
            temp = temp.next ;
            sz++; 
        }
        if(n ==sz){
            head = head.next;       //remove first 
            return ;
        }
        // other cases travel to sz-n 
        int i = 1;
        int itofind = sz-n ;
        Node prev = head ;
        while(i != itofind){
            prev = prev.next ;
            i++ ;
        } 
        prev.next = prev.next.next ;
        return ;
    }

    public Node findmidNode(Node head){             // Slow Fast Approach 
        Node slow = head ;
        Node fast = head ;
        while(fast != null && fast.next != null){       
            slow = slow.next ;          //+1
            fast = fast.next.next ;     //+2
        }
        return slow ;       //Slow is the Mid Node 
    }

    public boolean CheckPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //Step-1 Find Mid :
        Node midnode = findmidNode(head) ;
        //Step-2 Reverse 2nd half :
        Node prev = null ;
        Node curr = midnode ;
        Node next;
        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        Node right = prev ;     //Right half head 
        Node left = head ;      //Left half head 

        //Step-3 Check Left Half and Right Half :
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next ;
            right = right.next ;
        }
        return true ;
    }

    public boolean iscycle(){
        Node slow = head ;
        Node fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast){
                return true ;       //Cycle Exist 
            }
        }
        return false ;          // Cycle doesnt Exist
    }

    public static void removeCycle(){
        //Detect Cycle 
        Node slow = head ;
        Node fast = head ;
        boolean cycle = false ;     //Flag
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast){
                cycle = true;
                break ;
            }
        }
        if(cycle == false){
            return ;
        }
        //Find Meeting point  
        slow = head ;
        Node prev = null;
        while(slow != fast){
            slow = slow.next ;
            prev = fast ;
            fast = fast.next ;
        }
        //Remove cycle last.next = null
        prev.next = null ;
    }

    public void zigzag(){
        //find mid 
        Node slow = head ;
        Node fast = head.next ;
        while (fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        Node mid = slow ;

        //reverse 2nd half 
        Node curr = mid.next ;
        mid.next = null ;
        Node prev = null ;
        Node next;
        while(curr != null){
            next = curr.next ; 
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        Node left = head ;
        Node right = prev ;
        Node nextL , nextR ;
        //alt merge / zig zag merge
        while(left != null && right != null){
            nextL = left.next ;
            left.next = right ;
            nextR = right.next ;
            right.next = nextL ;
            
            left = nextL ;
            right = nextR ;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);              // We ll create some methods to add elements 
        // ll.head.next = new Node(2);         // to the ll rather than every time doing in main       add , remove , search , print  

        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        
        ll.addAtIdx(2, 9);
        ll.print();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();
        
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

        System.out.println(ll.itrsearch(3));
        System.out.println(ll.itrsearch(10));
        System.out.println(ll.recSearch(3));
        ll.reverse();
        ll.print();

        ll.deletenthNodefromEnd(3);
        ll.print();

        // System.out.println(ll.findmidNode(head));
        
    //     LinkedList ll2 = new LinkedList();
    //     ll2.addFirst(1);
    //     ll2.addLast(2);                                      ....These wont work sincs we have created head and tail as globle variables !!!!
    //     ll2.addLast(2);
    //     ll2.addLast(1);
    //     ll2.print();
    //     System.out.println(ll2.CheckPalindrome());
    // 
        ll.addLast(1);
        ll.addLast(9);
        ll.print();
        System.out.println(ll.CheckPalindrome());

        head = new Node(1);
        Node temp = new Node(2) ;
        head.next = temp ;
        head.next.next = new Node(3);
        head.next.next.next = temp ;
        System.out.println(ll.iscycle());
        removeCycle();
        System.out.println(ll.iscycle());

        ll.zigzag();
        ll.print();
    }
}
