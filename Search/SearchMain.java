package Search;

import java.util.Arrays;

public class SearchMain {
    public static void main(String[] args) {
        int[] inp = new int[]{2,3,4,4,3,2,10,2,6,9,23,43,4235,25,325,54,32,23,432,4,324,325,23,4324,36,7544};
        Arrays.sort(inp);
        int target = 2;
        BinarySearch bSearch = new BinarySearch();
        System.out.println(bSearch.search(inp, target));
    }
}
