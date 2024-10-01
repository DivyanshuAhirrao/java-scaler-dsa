package arrays;

import java.util.Arrays;

public class MergeDecreasedSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {4,2,6,9,0,0,0}, arr2 = {5,1,7,3};
        int m=3, n=4;
        mergeArray(arr1, m, arr2, n);
    }

    private static void mergeArray(int[] arr1, int m, int[] arr2, int n) {
        for (int i=0, j=m;i<n; i++) {
            arr1[j] = arr2[i];
            j++;
        }
        Arrays.sort(arr1);
    }
}
