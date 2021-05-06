package BellmannFord;

public class BellmannFord {
    int dist[];
    public BellmannFord(int numberOfVertices){
        dist = new int[numberOfVertices];
        for(int i = 0; i < numberOfVertices; i++) dist[i] = Integer.MAX_VALUE;
    }

    public int[] getShortestPathFromNode(Edge[] edges, int startNode){
        dist[startNode] = 0;
        for(int i =0 ; i < dist.length - 1; i++){
            for(Edge edge : edges){
                dist[edge.dst] = Math.min(dist[edge.dst], dist[edge.src] + edge.cost);
            }
        }
        for(int i =0 ; i < dist.length - 1; i++){
            for(Edge edge : edges){
                if(dist[edge.dst] > dist[edge.src] + edge.cost){
                    dist[edge.dst] = Integer.MIN_VALUE;
                }
            }
        }
        return dist;
    }


}
