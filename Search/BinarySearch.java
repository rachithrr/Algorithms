package Search;

public class BinarySearch {
    public int search(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int mid = low + (high - low)/2;
        
        while(low < high){
            if(arr[mid] == target) return mid;
            if(target > arr[mid]) low = mid + 1;
            else high = mid - 1;
            mid = low + (high - low)/2;
        }
        return -1;

    }
}