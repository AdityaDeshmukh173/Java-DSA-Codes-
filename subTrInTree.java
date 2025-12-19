public class subTrInTree {
    
    static class Node{
        int data ;
        Node left ;
        Node right ;
        public Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }

    public static boolean isidenticle(Node node, Node subRoot){
        if(node == null && subRoot==null){
            return true ;
        }else if(node==null || subRoot==null || node.data != subRoot.data){
            return false ;
        }
        
        if(!isidenticle(node.left, subRoot.left)){
            return false ;
        }
        if(!isidenticle(node.right, subRoot.right)){
            return false ;
        }
        return true ; 
    }

    public static boolean isSubTree(Node root, Node subRoot){
        if(root == null){
            return false ;
        }
        if(root.data == subRoot.data){
            if(isidenticle(root , subRoot)){
                return true ;
            }
        }
        // boolean lans = isSubTree(root.left, subRoot) ;
        // boolean rans = isSubTree(root.right, subRoot) ;
        // return lans || rans ;
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot) ;        //More Efficient than the above 3 lines !!! It will check left if found then wont go for right..
    }

    public static void main(String args[]){
        Node root = new Node(1) ;           //Tree Main 
        root.left = new Node(2) ;
        root.right = new Node(3) ;
        root.left.left = new Node(4) ;
        root.left.right = new Node(5) ;
        root.right.left = new Node(6) ;
        root.right.right = new Node(7) ;

        Node subRoot = new Node(2) ;        // SubTree 
        subRoot.left = new Node(4) ;
        // subRoot.right = new Node(5) ;

        System.out.println(isSubTree(root, subRoot));
    }
}
