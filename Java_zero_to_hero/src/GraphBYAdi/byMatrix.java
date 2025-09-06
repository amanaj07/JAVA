package GraphBYAdi;
import java.util.Scanner;
public class byMatrix {
    public static class GraphMatrix {
        private int[][] adjMatrix;
        private int numVertex;
        private boolean directed;

        //constructor
        public GraphMatrix(int numVertex, boolean directed) {
            this.numVertex = numVertex;
            this.directed = directed;
            adjMatrix = new int[numVertex][numVertex];
        }

        //ade edge
        public void addEdge(int src, int dest) {
            if (src >= numVertex || dest >= numVertex || src < 0 || dest < 0) {
                System.out.println("invalid src and destination");
                return;
            }
            adjMatrix[src][dest] = 1;
            if (!directed) {
                adjMatrix[dest][src] = 1;
            }
        }

        //disply matrix
        public void display() {
            for (int i = 0; i < numVertex; i++) {
                for (int j = 0; j < numVertex; j++) {
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("is you graph is directer or not");
        String DirecterdInput=sc.nextLine().trim().toLowerCase();
        boolean isdirected= DirecterdInput.equals("yes");

        System.out.println("enter the nummber of vetex");
        int vertex=sc.nextInt();
        System.out.println("enter the nummber of edges");
        int edges=sc.nextInt();
        GraphMatrix graph = new GraphMatrix (vertex, isdirected);
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
