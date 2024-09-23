package arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2,2,3,5,2,2,5,2,2,4,5};
        System.out.println("Majority Element is : " +findMajorityElement(arr, arr.length));
    }

    public static int findMajorityElement(int[] arr, int length) {
        int candidate = arr[0];
        int count = 1;
        for (int i=1; i< length; i++) {
            if (arr[i] == candidate) {
                count ++;
            } else {
                count--;
            }
            if (count == 0){
                candidate = arr[i];
                count = 1;
            }
        }
        count = 0;
        for (int val : arr) {
            if (val == candidate) {
                count++;
            }
        }
        if (count > length/2) {
            return candidate;
        } else {
            return -1;
        }
    }
}
