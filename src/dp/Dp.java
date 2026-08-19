package dp;

import java.util.*;

public class Dp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
//        System.out.print("Enter number of stairs : ");
//        
//        int n  = sc.nextInt();
//        
//        int result = climbingStairs.climbStairs(n); // mthd is static class depndnt 
//        
//        System.out.println("Number of ways = " + result);
//        
//        sc.close();


        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();
        
        int[] cost = new int[n];
        System.out.println("Enter cost of each stair:");
         for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        int ans = Min_Cost.minCostClimbStairs(cost);
        
        System.out.print("min cost req to react at position : " + ans );
        sc.close();
    }
    
}


// static mthd belong to the class--> climbingStairs -->climbStairs, no obj required
//non-static mthd belong to object, so req -->  ClimbingStairs obj = new ClimbingStairs(); and  int result = obj.climbStairs(n);