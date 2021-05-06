package Kruskals;
class Edge implements Comparable<Edge>{
    int src;
    int dst;
    int cost;

    public Edge(int s, int d, int c){
        src = s;
        dst = d;
        cost = c; 
    }

    @Override
    public int compareTo(Edge edge){
        //System.out.print("src = "+src+" dst ="+dst + " cost ="+cost);
        return cost - edge.cost;
    }
}