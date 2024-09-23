package binarySearch;

import java.util.Scanner;

public class SortedAndRotatedArr {
    public static void main(String[] args) {
        int[] arr = {9,11,14,15,20,22,25,2,3,5,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target Number :");
        int target = sc.nextInt();
        int midIndex = findMin(arr);
        int ans = binaryRotateSearch(arr , 0, midIndex-1, target);
        if (ans == -1) {
            binaryRotateSearch(arr, midIndex, arr.length-1, target);
        }
        System.out.println("Index is : "+ans);
    }

    public static int binaryRotateSearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


    public static int findMin(int[] arr) {
        int left = 0, right= arr.length-1;
        while (left < right) {
            int mid = (left+right)/2;
            if(arr[mid] < arr[right]) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}
