package GraphBYAdi;
import java.util.*;
public class byList {
    public static class listGraph{
        private int numVertex;
        private boolean direction;
        private List<List<Integer>> adjList;
//        constructor
        public listGraph(int numVertex,boolean direction){
            this.numVertex=numVertex;
            this.direction=direction;
            adjList = new ArrayList<>();
            for (int i = 0; i < numVertex; i++) {
                adjList.add(new ArrayList<>());
            }

        }
        //add edge
        public void addEdge(int scr,int des){
            if(scr>=numVertex||des>=numVertex||scr<0||des<0){
                System.out.println("invalid entry");
            }
            adjList.get(scr).add(des);
            if(!direction){
                adjList.get(des).add(scr);
            }
        }
        public void display() {
            System.out.println("Adjacency List:");
            for (int i = 0; i < numVertex; i++) {
                System.out.print(i + ": ");
                for (int neighbor : adjList.get(i)) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Is your graph directed? (yes/no):");
        String directedInput = sc.nextLine().trim().toLowerCase();
        boolean isDirected = directedInput.equals("yes");

        System.out.println("Enter the number of vertices:");
        int vertex = sc.nextInt();

        System.out.println("Enter the number of edges:");
        int edges = sc.nextInt();

        listGraph graph = new listGraph(vertex, isDirected);

        System.out.println("Enter each edge in the format: <source> <destination>");
        for (int i = 0; i < edges; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(src, dest);
        }

        graph.display();
        sc.close();
    }

}
