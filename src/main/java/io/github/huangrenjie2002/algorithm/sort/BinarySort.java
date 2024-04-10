package io.github.huangrenjie2002.algorithm.sort;

public class BinarySort {

    public static int sort(int target, int[] arg){
        int i = 0, j = arg.length;
        while(i < j){
            int mid = i + (j - i) >>> 1;
            if (target < arg[mid]){
                j = mid;
            }else if (arg[mid] < target){
                i = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
