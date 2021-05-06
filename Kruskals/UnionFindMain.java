package Kruskals;
import java.util.Arrays;

public class UnionFindMain {

    private static void kruskals(Edge[] edges, int n){
        UnionFind unionFind = new UnionFind(n);
        Arrays.sort(edges);
        for(int i = 0; i < edges.length; i++){
            Edge edge = edges[i];
            if(unionFind.connected(edge.src, edge.dst)){
                System.out.print(edge.src+" and "+edge.dst+" are already connected\n");
                continue;
            } 

            unionFind.union(edge.src, edge.dst);
            System.out.print("Connecting "+edge.src+" and "+edge.dst+"\n");
            //if(unionFind.size(0) == n) return;
        }
        unionFind.printIds();
    }

    public static void main(String[] args) {
        Edge[] edge = new Edge[10];

        edge[0] = new Edge(0, 1, 10);
        edge[1] = new Edge(0, 2, 6);
        edge[2] = new Edge(0, 3, 5);
        edge[3] = new Edge(1, 3, 15);
        edge[4] = new Edge(2, 3, 4);
        edge[5] = new Edge(3, 5, 10);
        edge[6] = new Edge(4, 0, 20);
        edge[7] = new Edge(2, 5, 14);
        edge[8] = new Edge(5, 1, 9);
        edge[9] = new Edge(5, 4, 11);
        kruskals(edge, 6);

    }
}
