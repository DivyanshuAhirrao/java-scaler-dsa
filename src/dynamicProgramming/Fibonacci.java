package dynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the Number for Fibonacci");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( "Fibonacci for "+n+" Number : "+fibTabulation(n));
    }

    public static int fibTabulation(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;
        for (int i=2; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
