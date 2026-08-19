package dp;

import java.util.*;

public class Dp {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of stairs : ");
        
        int n  = sc.nextInt();
        
        int result = climbingStairs.climbStairs(n); // mthd is static class depndnt 
        
        System.out.println("Number of ways = " + result);
        
        sc.close();
    }
    
}


// static mthd belong to the class--> climbingStairs -->climbStairs, no obj required
//non-static mthd belong to object, so req -->  ClimbingStairs obj = new ClimbingStairs(); and  int result = obj.climbStairs(n);