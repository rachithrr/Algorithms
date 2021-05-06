package Heap;

import java.util.ArrayList;

public class Heap {
    public static final boolean MIN_HEAP = true;
    public static final boolean MAX_HEAP = false;
    private boolean isMinHeap;
    private ArrayList<Integer> mList;
    public Heap(){
        isMinHeap = MIN_HEAP;
        mList = new ArrayList<>();
    }
    public Heap(boolean heap_style){
        mList = new ArrayList<>();
        isMinHeap = heap_style;
    }

    private void swap(int i, int j){
        int cur = mList.get(i);
        mList.set(i, mList.get(j));
        mList.set(j, cur);
    }

    private void swim(){
        int sz = mList.size() - 1;
        while(true){
            int i = (sz - 1)/2;
            if(i < 0) break;
            if(isMinHeap){
                if(mList.get(i) > mList.get(sz)){
                    swap(i, sz);
                    sz = i;
                }else{
                    break;
                }
            }else{
                if(mList.get(i) < mList.get(sz)){
                    swap(i, sz);
                    sz = i;
                }else{
                    break;
                }
            }
        }
    }

    private void sink(){
        int sz = mList.size();
        int cur = 0;
        while(true){
            int left = 2 * cur + 1;
            int right = 2 * cur + 2;
            if(left >= sz) break;
            if(isMinHeap){
                if(right >= sz || mList.get(left) < mList.get(right)){
                    swap(cur, left);
                    cur = left;
                }else{
                    swap(cur, right);
                    cur = right;
                }
            }else{
                if(right >= sz || mList.get(left) > mList.get(right)){
                    swap(cur, left);
                    cur = left;
                }else{
                    swap(cur, right);
                    cur = right;
                }
            }
        }
    }

    public void add(int num){
        mList.add(num);
        swim();
    }

    public int poll(){
        swap(0, mList.size() - 1);
        int out = mList.remove(mList.size() - 1);
        sink();
        return out;
    }

    public int size(){
        return mList == null ? 0 : mList.size();
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for(int i : mList) out.append(" "+i);
        return out.toString();
    }

}
