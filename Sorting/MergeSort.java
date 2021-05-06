package Sorting;

public class MergeSort {
    
    public void mSort(int[] arr, int low, int high){
        if(low >= high) return;

        int mid = (high + low)/2;

        mSort(arr, low, mid);
        mSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high){
        int[] lef  = new int[mid - low  + 1];
        int[] rig = new int[high - mid];
        for(int i = 0; i < lef.length; i++) lef[i] = arr[low + i];
        for(int i = 0; i < rig.length; i++) rig[i] = arr[mid + i + 1];
        int i = 0, j = 0, k = low;
        while(i < lef.length && j < rig.length && k < arr.length){
            if(lef[i] <= rig[j]){
                arr[k] = lef[i];
                i++;
            }else{
                arr[k] = rig[j];
                j++;
            }
            k++;
        }
        while(i < lef.length && k < arr.length){
            arr[k] = lef[i];
            i++;
            k++; 
        }
        while(j < rig.length && k < arr.length){
            arr[k] = rig[j];
            j++;
            k++; 
        }
    }

}
