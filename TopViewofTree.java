import java.util.*;
import java.util.LinkedList;
public class TopViewofTree {

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

    static class Info{
        Node node ;
        int hd ;        // Horizontal Distance 
        public Info(Node node , int hd){
            this.node = node ;
            this.hd = hd ;
        }
    }

    public static void TopView(Node root){
        //Level Order Traversal
        Queue<Info> q = new LinkedList<>() ;
        HashMap<Integer,Node> map = new HashMap<>() ;

        int min = 0 , max = 0 ;
        q.add(new Info(root, 0)) ;
        q.add(null) ;

        while(!q.isEmpty()){
            Info curr = q.remove() ;
            if(curr == null){
                if(q.isEmpty()){
                    break ;
                }else{
                    q.add(null) ;
                }
            }else{
                if(!map.containsKey(curr.hd)){       //If map does not contains hd value as curr!! i.e. First time my hd is occuring 
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1)) ;
                    min = Math.min(min, curr.hd-1) ;
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1)) ;
                    max = Math.max(max, curr.hd+1) ;
                }
            }
        }

        for(int i =min ; i<=max ; i++){
            System.out.print( map.get(i).data+" "); 
        }
        System.out.println();
    }

    // Kth Level of Tree        TC = O(n)
    public static void kLevel(Node root, int level, int k){
        if(root == null){
            return ;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return ;
        }
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }

    //part of approach 1 for lca
    public static boolean getPath(Node root ,int n, ArrayList<Node> path){
        if(root == null){
            return false ;
        }
        path.add(root) ;
        if(root.data == n){
            return true ;
        }

        boolean foundleft = getPath(root.left, n, path) ;
        boolean foundright = getPath(root.right, n, path) ;

        if(foundleft || foundright){
            return true ;
        }

        path.remove(path.size()-1) ;
        return false ;
    }
    // Approach 1 for LCA 
    public static Node lca(Node root, int n1 , int n2){     //lca = lowest common ancestor              TC = O(n)       SC = O(n)
        ArrayList<Node> path1 = new ArrayList<>() ;
        ArrayList<Node> path2 = new ArrayList<>() ;

        getPath(root, n1, path1) ;
        getPath(root, n2, path2) ;

        //Last Common Ancestor
        int i=0 ;
        for( ; i<path1.size() && i<path2.size() ;i++){
            if(path1.get(i) != path2.get(i)){
                break ;
            }
        }

        // Last equal node -> i-1th
        Node lca = path1.get(i-1) ;
        return lca ;
    }

    //Approach 2 for LCA 
    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root ;
        }

        Node leftLCA = lca2(root.left, n1, n2) ;
        Node rightLCA = lca2(root.right, n1, n2) ;

        //leftlca=val rightlca=null
        if(rightLCA == null){
            return leftLCA ;
        }
        if(leftLCA == null){
            return rightLCA ;
        }

        return root ;
    }

    //Min dist betn nodes 
    public static int lcaDist(Node root , int n){
        if(root == null){
            return -1 ;
        }
        if(root.data == n){
            return 0 ;
        }

        int leftdist = lcaDist(root.left, n) ;
        int rightdist = lcaDist(root.right, n) ;

        if(leftdist == -1 && rightdist == -1){
            return -1 ;
        } else if(leftdist == -1){
            return rightdist+1 ;
        } else{
            return leftdist+1 ;
        }
    }
    
    public static int minDist(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2) ;

        int dist1 = lcaDist(lca , n1) ;
        int dist2 = lcaDist(lca , n2) ;

        return dist1+dist2 ;
    }

    public static int KAncestor(Node root, int n, int k){
        if(root == null){
            return -1 ;
        }
        if(root.data == n){
            return 0 ;
        }

        int leftdist = KAncestor(root.left, n, k) ;
        int rightdist = KAncestor(root.right, n, k) ;

        if(leftdist == -1 && rightdist == -1){
            return -1 ;
        }
        
        int max = Math.max(leftdist, rightdist) ;
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1 ;
    }

    public static int sumtree(Node root){           //TC = O(n)
        if(root == null){
            return 0 ;
        }

        int leftchild = sumtree(root.left) ;
        int rightchild = sumtree(root.right) ;

        int data = root.data ;
        int newLeft = root.left == null ? 0 : root.left.data ;
        int newRight = root.right==null ? 0 : root.right.data ;
        root.data = leftchild+ newLeft +rightchild+ newRight ;
        
        return data ;
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
        Node root = new Node(1) ;
        root.left = new Node(2) ;
        root.right = new Node(3) ;
        root.left.left = new Node(4) ;
        root.left.right = new Node(5) ;
        root.right.left = new Node(6) ;
        root.right.right = new Node(7) ;

        TopView(root) ;
        
        int k = 3 ;
        kLevel(root, 1, k);
        System.out.println();
        
        int n1= 4 , n2 = 7 ;
        System.out.println(lca(root, n1, n2).data) ;

        System.out.println(lca2(root, n1, n2).data);

        System.out.println(minDist(root, n1, n2));

        int n = 5 ;
        k = 2 ;
        KAncestor(root, n, k);

        sumtree(root) ;
        preorder(root);
    }
}
