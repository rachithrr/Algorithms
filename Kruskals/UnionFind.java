package Kruskals;
class UnionFind{
    private int[] id, sz;
    public UnionFind(int n){
        id = new int[n];
        sz = new int[n];
        for(int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int find(int x){
        int root = x;
        while(id[x] != x){
            x = id[x];
        }
        //path compression. set all the path element's parent to the x(main parent) 
        while(x != root){
            int nex = id[root];
            id[root] = x;
            root = nex;
        }
        return x;
    }

    public void union(int x, int y){
        int px = find(x);
        int py = find(y);

        if(px == py) return;
        if(sz[px] > sz[py]){
            id[py] = px;
            sz[px] += sz[py];
        }else{
            id[px] = py;
            sz[py] += sz[px];
        }
    }

    public int size(int x){
        return sz[find(x)];
    }

    public boolean connected(int x, int y){
        return find(x) == find(y);
    }

    public void printIds(){
        for(int i : id) System.out.print(" "+i);
        System.out.println();
        for(int i : sz) System.out.print(" "+i);
        System.out.println();
    }

}