package recursionAndBacktracking;

import java.util.ArrayList;

public class AllPermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arrSum = {10, 20, 30, 40, 50};
        int target = 60;
//        printPermutations(arr,0,new boolean[arr.length],new ArrayList<>());
        printSumOfPermutations(arrSum, 0,  target, new ArrayList<>());
    }

    public static void printPermutations(int[] arr, int pos, boolean[] selected, ArrayList<Integer> ans) {
        if (pos == arr.length) {
            System.out.println(ans+ " <<< Permutants" );
            return;
        }
        for (int i=0;i< arr.length;i++) {
            if (selected[i] == false) {
                selected[i] = true;
                ans.add(arr[i]);
                printPermutations(arr, pos+1, selected, ans);
                selected[i] = false;
                ans.remove(ans.size()-1);
            }
        }
    }

    public static void printSumOfPermutations(int[] arrSum, int i, int target, ArrayList<Integer> ans) {
        if (target < 0){
            return;
        }
        if (i == arrSum.length) {
            if (target == 0)
            System.out.println(ans);
            return;
        }
        //select i'th item
        ans.add(arrSum[i]);
        printSumOfPermutations(arrSum, i+1, target-arrSum[i], ans);
        ans.remove(ans.size()-1);

        //reject i'th item
        printSumOfPermutations(arrSum, i+1, target, ans);
    }


}
