import java.util.*;
import java.util.LinkedList;

public class BinaryTrees1 {
    static class Node{
        int data ;
        Node left ;
        Node right ;

        Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }
    }
    static class BinaryTrees{
        static int idx = -1 ;
        public static Node buildtree(int nodes[]){          // Inorder Tree : O(n)
            idx++;
            if(nodes[idx] == -1){
                return null ;
            }
            Node newNode = new Node(nodes[idx]) ;
            newNode.left = buildtree(nodes) ;
            newNode.right = buildtree(nodes) ;

            return newNode ;
        }

        public static void preorder(Node rootNode){         // TC O(n)
            if(rootNode != null){
                System.out.print(rootNode.data+" ");
                preorder(rootNode.left);
                preorder(rootNode.right);
            }// }else{
            //     System.out.print("-1 ");
            // }
        }
        public static void inorder(Node rootNode){          // TC O(n)
            if(rootNode != null){
                inorder(rootNode.left);
                System.out.print(rootNode.data+" ");
                inorder(rootNode.right);
            }
        }
        public static void postorder(Node rootNode){        // TC O(n)
            if(rootNode != null){
                postorder(rootNode.left);
                postorder(rootNode.right);
                System.out.print(rootNode.data+" ");
            }
        }

        public static void levelorder(Node root){
            if(root == null){
                return ;
            }

            Queue<Node> q = new LinkedList<>() ;
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove() ;
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break ;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ;
        
        BinaryTrees tree = new BinaryTrees() ;
        Node root = tree.buildtree(nodes) ;
        System.out.println(root.data);
        
        System.out.println("PreOrder :");
        tree.preorder(root);
        System.out.println("\nInOrder :");
        tree.inorder(root);
        System.out.println("\nPostOrder :");
        tree.postorder(root);
        System.out.println("\nLevel Order :");
        tree.levelorder(root);
    }
}
