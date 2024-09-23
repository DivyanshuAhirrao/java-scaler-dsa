package binarySearch;

public class MinSortRotatedArr {
    public static void main(String[] args) {
//        int[] arr = {9,11,14,15,20,22,25,2,3,5,7};
        int[] arr = {9,11,1,3,20,14,15,5,7,22,25};
        System.out.println("Min Number is : "+findRotatedMin(arr));
    }

    public static int findRotatedMin(int[] arr) {
        int left = 0, right=arr.length-1;
        while (left < right) {
            int mid = (left+right)/2;
            if (arr[mid] < arr[right]) right = mid;
            else left=mid+1;
        }
        return arr[left];
    }
}
