package dp;

public class climbingStairs {
    
//    public static int climbStairs(int n){
//        
//        if(n <= 2){
//            return n;
//        }
//        int[] dp = new int[n + 1];
//        
//        dp[1] = 1; dp[2] = 2;
//        
//        for(int i = 3; i <= n; i++){
//            dp[i] = dp[i - 2] + dp[i - 1];
//        }
//        return dp[n];
//    }
    
    public static int climbStairs(int n){
        
        if(n <= 2){
            return n;
        }
        
        int prev1 = 2;
        int prev2 = 1;
        
        for(int i = 3; i <= n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}

//non-static mthd belongs to an object of climbingstairs, not directly to the class 