package io.github.huangrenjie2002.algorithm.sort;

/**
 * Binary search algorithm
 */
public class BinarySearch {

    /**
     * if target in arg return index, not in return -1;
     * @param target The value to look for
     * @param arg Sorted array
     * @return index
     */
    public static int search(int target, int[] arg){
        if(arg == null || arg.length == 0){
            throw new NullPointerException("arg is null");
        }
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
