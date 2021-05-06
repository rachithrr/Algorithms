package Sorting;

import java.util.Random;

public class SortMain {
    public static void main(String[] args) {
        //int[] in = new int[]{5,9,2,1,4,7,8,2,10,3, 100};
        int[] inp = new int[100];
        int[] inpp = new int[100];
        Random random = new Random();
        for(int i = 0 ; i < 100; i++){
            inp[i] = random.nextInt(1000);
            inpp[i] = random.nextInt(1000);
        }
        System.out.print("SortInput -> ");
        for(int i : inp) System.out.print(" " +i);
        System.out.println();
        System.out.println("MergeSort -> ");
        MergeSort mSort = new MergeSort();
        long st = System.nanoTime();
        System.out.println(st);
        mSort.mSort(inp, 0, inp.length - 1);
        st = System.nanoTime() - st;
        System.out.println(st);
        for(int i : inp) System.out.print(" " +i);
        System.out.println();

        BubbleSort bSort = new BubbleSort();
        st = System.nanoTime();
        bSort.bSort(inpp);
        st = System.nanoTime() - st;
        System.out.println(st);

    }
}
