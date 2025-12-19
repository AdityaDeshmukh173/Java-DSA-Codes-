public class DiameterofTree {
    
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

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left) ;
        int rh = height(root.right) ;
        return Math.max(lh, rh)+1 ;
    }

    public static int diameter(Node root){              //Approach 1 : TC = O(n^2)
        if(root == null){
            return 0 ;
        }

        int leftdia = diameter(root.left) ;
        int lh = height(root.left) ;
        int rightdia = diameter(root.right) ;
        int rh = height(root.right) ;

        int selfdia = lh+rh+1 ;
        return Math.max(selfdia, Math.max(rightdia, leftdia)) ;
    }                   

    static  class Info{
        int diam ;
        int ht ;

        public Info(int diam, int ht){
            this.diam = diam ;
            this.ht = ht ;
        }
    }
    public static Info newdiameter(Node root){              //Approach 2 : TC = O(n)
        if(root == null){
            return new Info(0, 0) ;
        }
        Info leftInfo = newdiameter(root.left) ;
        Info rightInfo = newdiameter(root.right) ;

        int diameter = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1) ;
        int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diameter, height) ;
    }

    public static void main(String args[]){

        Node root = new Node(1) ;
        root.left = new Node(2) ;
        root.right = new Node(3) ;
        root.left.left = new Node(4) ;
        root.left.right = new Node(5) ;
        root.right.left = new Node(6) ;
        root.right.right = new Node(7) ;
        
        System.out.println(diameter(root));
        System.out.println(newdiameter(root).diam);
        System.out.println(newdiameter(root).ht);
    }
}
