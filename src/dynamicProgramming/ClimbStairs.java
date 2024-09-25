package dynamicProgramming;

import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println("Enter the Number of Stairs :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( "Total ways to raach "+n+"th Stair : "+climbStairsTabulation(n));
    }
    public static int climbStairsTabulation(int n) {
        int[] dp = new int[n+1];
        dp[0]=0; dp[1] = 1; dp[2] = 2;
        for (int i=3;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            System.out.println(dp[i]+ " dp[i]");

        }
        return dp[n];
    }
}
