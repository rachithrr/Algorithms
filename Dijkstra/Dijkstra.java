package Dijkstra;

import java.util.PriorityQueue;

public class Dijkstra {
    private int[] dist;
    private boolean[] visited; 
    private PriorityQueue<CustomKeyValue> pq;
    public Dijkstra(int n){
        dist = new int[n];
        visited = new boolean[n];
        pq = new PriorityQueue<>(n);
        for(int i = 0; i < n; i++){
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
    }

    public int[] getShortestPathFromNode(Edge[] edges, int starter){
        dist[starter] = 0;
        pq.add(new CustomKeyValue(0,0));

        while(!pq.isEmpty()){
            CustomKeyValue curPair = pq.poll();
            for(Edge edge : edges){
                if(edge.src != curPair.key) continue;
                int newDist = curPair.value + edge.cost;
                if(newDist < dist[edge.dst]){
                    dist[edge.dst] = newDist;
                    pq.add(new CustomKeyValue(edge.dst, newDist));
                }
            }
        }
        return dist;
    }

}
