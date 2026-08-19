package dp;

import java.util.*;

public class Dp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of stairs : ");
        
        int n  = sc.nextInt();
        
        int result = climbingStairs.climbStairs(n);
        
        System.out.println("Number of ways = " + result);
        
        sc.close();
    }
    
}
