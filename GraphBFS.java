import java.util.*;
import java.util.LinkedList;

public class GraphBFS {    




    static class Edge{
        int src ;
        int dest ;
        int wt ;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w ;
        }   
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(new Edge(0, 1 , 1)) ;
        graph[0].add(new Edge(0, 2 , 1)) ;
        
        graph[1].add(new Edge(1, 0 , 1)) ;
        graph[1].add(new Edge(1, 3 , 1)) ;

        graph[2].add(new Edge(2, 0 , 1)) ;
        graph[2].add(new Edge(2, 4 , 1)) ;
        
        graph[3].add(new Edge(3, 1 , 1)) ;
        graph[3].add(new Edge(3, 4 , 1)) ;
        graph[3].add(new Edge(3, 5 , 1)) ;
        
        graph[4].add(new Edge(4, 2 , 1)) ;
        graph[4].add(new Edge(4, 3 , 1)) ;
        graph[4].add(new Edge(4, 5 , 1)) ;
        
        graph[5].add(new Edge(5, 3 , 1)) ;
        graph[5].add(new Edge(5, 4 , 1)) ;
        graph[5].add(new Edge(5, 6 , 1)) ;
        
        graph[6].add(new Edge(6, 5 , 1)) ;

    }

    public static void BFS(ArrayList<Edge> graph[]){            //TC = O(V+E)
        Queue<Integer> q = new LinkedList<>() ;
        boolean vis[] = new boolean[graph.length] ;

        q.add(0) ; //src = 0

        while (!q.isEmpty()) {
            int curr = q.remove() ;
            if (!vis[curr]) {       // visit curr
                System.out.print(curr+" ");
                vis[curr] = true ;
                for(int i=0 ; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i) ;
                    q.add(e.dest) ;
                }
            }        
        }
        System.out.println();
    }

    public static void DFS(ArrayList<Edge> graph[] , int curr, boolean vis[]){          // TC = O(V+E)
        //visit
        System.out.print(curr+" ");
        vis[curr] = true ;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i) ;
            if (!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }
    }


    public static boolean HasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]){       // TC = O(V+E)
        if (src == dest) {
            return true;
        }
        vis[src] = true ;
        for(int i=0 ;i<graph[src].size() ;i++){
            Edge e = graph[src].get(i) ;
            // e.dest = neighbor
            if (!vis[e.dest] && HasPath(graph ,e.dest ,dest ,vis)) {
                return true ;
            }
        }
        return false ;
    }

    
    public static void main(String[] args) {
        
        int v= 7; 
        ArrayList<Edge> [] graph = new ArrayList[v] ;   // null -> empty ArrayList 
        createGraph(graph);
        
        BFS(graph);
        
        DFS(graph, 0, new boolean[v]);
        

        System.out.println(HasPath(graph, 0, 5, new boolean[v]));
    }
}
