import java.util.*;
import java.util.LinkedList;

public class TopologicalSort {

    static class Edge {
        int src ;
        int dest ;
        public Edge(int s, int d){
            this.src = s ;
            this.dest = d ;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3)) ; 
        
        graph[3].add(new Edge(3, 1)) ; 
        
        graph[4].add(new Edge(4, 0)) ; 
        graph[4].add(new Edge(4, 1)) ; 
        
        graph[5].add(new Edge(5, 0)) ; 
        graph[5].add(new Edge(5, 2)) ; 
    }

    public static void TopSort(ArrayList<Edge> graph[]){            //O(V+E)            Using DFS
        boolean vis[] = new boolean[graph.length] ;
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if (!vis[i]) {
                TopSortUtil(graph, i, vis, s);        
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }

    public static void TopSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack s){          //Using DFS
        vis[curr] = true ;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i) ;
            if (!vis[e.dest]) {
                TopSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr) ;
    }

                // Topological Sort Using BFS       Kahn's Algo 
    
    public static void CalcInDegree(ArrayList<Edge> graph[], int indeg[]){
        for(int i=0; i<graph.length; i++){                  // i = vertex
            for(int j=0 ;j<graph[i].size(); j++){
                Edge e = graph[i].get(j) ;
                indeg[e.dest]++ ;
            }
        }
    }

    public static void TopSortBFS(ArrayList<Edge> graph[]){
        int indeg[] = new int[graph.length] ;
        CalcInDegree(graph, indeg);
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<indeg.length; i++){
            if (indeg[i] == 0) {
                q.add(i) ;
            }
        }
    
        //BFS 
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+" ");

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest) ;
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int v = 6 ;
        ArrayList<Edge> graph[] = new ArrayList[v] ;
        createGraph(graph);
        
        // TopSort(graph);
        TopSortBFS(graph);
    }
}
