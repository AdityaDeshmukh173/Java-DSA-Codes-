public class BSTmirrorque {
    
    static class Node{
        int data ;
        Node left ;
        Node right ;
        Node(int data){
            this.data = data ;
            this.right = this.left = null ;
        } 
    }

    public static Node mirrorBST(Node root){        // TC = O(n)
        if(root == null){
            return null ;
        }
        Node leftSubTr = mirrorBST(root.left) ;     //Left ka mirror 
        Node rightSubTr = mirrorBST(root.right) ;   //Right ka mirror
        
        root.left = rightSubTr ;
        root.right = leftSubTr ; 
        return root ;
    }

    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]){
        Node root = new Node(8) ;
        root.left = new Node(5) ;
        root.right = new Node(10) ;
        root.left.left = new Node(3) ;
        root.left.right = new Node(6) ;
        root.right.right = new Node(11) ;

        preorder(root);
        root = mirrorBST(root) ;
        System.out.println();
        preorder(root);
    }
}
