package Dijkstra;

public class CustomKeyValue implements Comparable<CustomKeyValue>{
    
    int key;
    int value;

    public CustomKeyValue(int k, int v){
        key = k;
        value = v;
    }

    @Override
    public int compareTo(CustomKeyValue o) {
        return value - o.value;
    }
    
}
