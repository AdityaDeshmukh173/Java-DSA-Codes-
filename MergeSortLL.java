public class MergeSortLL {

    public static class Node{
        int data ;
        Node next ;

        public Node (int data){
            this.data = data ;
            this.next = null ;
        }
    }

    private Node getmid(Node head){
        Node slow = head ;
        Node fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;//midn node 
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL ;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1 ;
                head1 = head1.next;
                temp = temp.next ;
            }else{
                temp.next = head2 ;
                head2 = head2.next ;
                temp = temp.next ;
            }
        }
        while(head1 != null){
            temp.next = head1 ;
            head1 = head1.next ;
            temp = temp.next ;
        }
        while(head2 != null){
            temp.next = head2 ;
            head2 = head2.next ;
            temp = temp.next ;
        }
        return mergedLL.next ;
    }
    private Node mergesort(Node head){              // O(nlogn)
        if(head == null || head.next == null){
            return head;
        }
        //Find Mid
        Node mid = getmid(head) ;

        //Left and Right half call MS
        Node RightHead = mid.next ;
        mid.next = null ;
        Node newleft = mergesort(head) ;
        Node newright = mergesort(RightHead) ;
        //Merge 
        return merge(newleft, newright) ;
    }
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        // ll.addFirst(5);
        ll.print();

        // ll.head = ll.mergesort(head);        Note Working !!!!
    
    }
}
