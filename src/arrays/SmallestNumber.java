package arrays;

import java.util.Scanner;

// Smallest Number whose product of digits is N. eg : 125 => 555 (5*5*5)
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number !!");
        int num = sc.nextInt();
        System.out.println("Your Smallest possible number is: "+ solution(num));
    }
    public static int solution(int n){
        String ans = "";
        for(int i = 9; i>=2; i-- ){
            while (n % i == 0){
                n=n/i;
                ans= i+ans;
            }
        }
        if (n != 1) {
            return -1;
        }
        return Integer.parseInt(ans);
    }
}
