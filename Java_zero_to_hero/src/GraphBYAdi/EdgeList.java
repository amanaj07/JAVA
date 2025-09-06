package GraphBYAdi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EdgeList {

    // ✅ Edge class (renamed to follow Java naming conventions)
    public static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }

        // ✅ Override toString to print nicely
        @Override
        public String toString() {
            return src + " -> " + dest;
        }
    }

    // ✅ Graph using Edge List
    public static class ListEdge {
        private boolean directed;
        private List<Edge> list;

        ListEdge(boolean directed) {
            this.directed = directed;
            this.list = new ArrayList<>();
        }

        // Add edge to the list
        public void addEdge(int src, int dest) {
            list.add(new Edge(src, dest));
            if (!directed) {
                list.add(new Edge(dest, src)); // for undirected graph
            }
        }

        // Display all edges
        public void display() {
            System.out.println("Edge List:");
            for (Edge e : list) {
                System.out.println(e);
            }
        }
    }

    // ✅ Main method completed
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Is the graph directed? (yes/no):");
        String dirInput = sc.nextLine().trim().toLowerCase();
        boolean isDirected = dirInput.equals("yes");

        System.out.println("Enter number of vertices:");
        int vertices = sc.nextInt(); // optional: for validation, not used here

        System.out.println("Enter number of edges:");
        int edgeCount = sc.nextInt();

        ListEdge graph = new ListEdge(isDirected);

        System.out.println("Enter each edge in the format: <source> <destination>");
        for (int i = 0; i < edgeCount; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(src, dest);
        }

        graph.display();
        sc.close();
    }
}
