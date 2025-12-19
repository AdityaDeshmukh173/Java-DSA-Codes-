public class LonWordwaPrefixes {
    //Longest Word With all Prefixres 

    static class Node{
        Node []children = new Node[26] ;
        boolean eow = false;

        public Node(){
            for(int i=0;i<26;i++){
                children[i] = null ;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root ;
        for(int lvl=0; lvl<word.length();lvl++){
            int idx = word.charAt(lvl)-'a' ;
            if (curr.children[idx] == null ) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx] ;
        }
        curr.eow = true; 
    }
 
    public static String ans = "" ;
    public static void LongestWord(Node root ,StringBuilder temp){
        if (root == null) {
            return ;
        }
        for(int i=0; i<26;i++){
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char)(i+'a') ;
                temp.append(ch) ;
                if (temp.length() > ans.length()) {
                    ans = temp.toString() ;
                }
                LongestWord(root.children[i], temp);
                //BackTrack
                temp.deleteCharAt(temp.length()-1) ;
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"a","app","banana","appl","ap","apply","apple"} ;
    
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        LongestWord(root, new StringBuilder()) ;
        System.out.println(ans);
    }
}
