public class QueueB {
    // Array Singly Queue
    static class Queue{
        static int arr[] ;
        static int size ;
        static int rear ;
        
        Queue(int n){
            arr = new int[n] ;
            size = n ;
            rear = -1 ;
        }

        public static boolean isEmpty(){
            return rear == -1 ;
        }

        public static void Enqueue(int data){
            if(rear == size-1){
                System.out.println("Queue is Full !!");
                return ;
            }
            rear = rear +1 ;
            arr[rear] = data ;
        }

        public static int Dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty !!");
                return -1 ;
            }
            int front = arr[0] ;
            for(int i=0 ; i<rear ; i++){            // O(n)
                arr[i] = arr[i+1] ;
            }
            rear = rear-1 ;
            return front ;
        }

        public static int Peek(){
            if(isEmpty()){
                System.out.println("Empty Queue !!");
                return -1 ;
            }
            return arr[0] ;
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue(5) ;
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        
        while(!q.isEmpty()){
            System.out.println(q.Peek());
            q.Dequeue() ;
        }
        q.Dequeue() ;
    }
}
