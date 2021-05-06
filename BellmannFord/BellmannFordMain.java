package BellmannFord;

public class BellmannFordMain {
    public static void main(String[] args) {
        Edge[] edges = new Edge[7];
        edges[0] = new Edge(0, 1, 4);
        edges[1] = new Edge(0, 2, 1);
        edges[2] = new Edge(2, 1, 2);
        edges[3] = new Edge(1, 3, 1);
        edges[4] = new Edge(2, 3, 5);
        edges[5] = new Edge(3, 4, 3);
        edges[6] = new Edge(4, 4, -5);
        BellmannFord bellmannFord = new BellmannFord(5);
        int[] shortest = bellmannFord.getShortestPathFromNode(edges, 0);
        for(int i : shortest) System.out.print(" "+i);
        System.out.println();
    }
}
