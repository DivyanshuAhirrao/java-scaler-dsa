package dynamicProgramming;

public class LongestIncSubSequence {
    public static void main(String[] args) {
        int[] arr = {5,7,4,3,2,1};
        System.out.println(longSubSeq(arr)+ " << longSubSeq");
    }

    public static int longSubSeq(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = 1;
        int ans = 0;
        for (int i=0;i<arr.length;i++) {
            int max = 0;
            for (int  j=0;j<i;j++) {
                if (arr[j] < arr[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max+1;
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
