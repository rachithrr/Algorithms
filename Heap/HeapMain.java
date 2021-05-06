package Heap;

public class HeapMain {
    // Need to fix this, some errors
    public static void main(String[] args) {
        Heap minHeap = new Heap(Heap.MIN_HEAP);

        minHeap.add(5);
        minHeap.add(10);
        minHeap.add(1);
        minHeap.add(3);
        minHeap.add(15);
        minHeap.add(20);
        System.out.println(" MinHeap Status -? "+minHeap);
        System.out.print(" min heap ->  ");
        while(minHeap.size() > 0){
            System.out.print(" "+ minHeap.poll());
        }
        System.out.println();

        Heap maxHeap = new Heap(Heap.MAX_HEAP);

        maxHeap.add(5);
        maxHeap.add(10);
        maxHeap.add(1);
        maxHeap.add(3);
        maxHeap.add(15);
        maxHeap.add(20);
        System.out.println(" MaxHeap Status -? "+maxHeap);
        System.out.print(" max heap ->  ");
        while(maxHeap.size() > 0){
            System.out.print(" "+ maxHeap.poll());
        }
        System.out.println();
    }
}
