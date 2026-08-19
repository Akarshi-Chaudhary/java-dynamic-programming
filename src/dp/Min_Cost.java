package dp;

import java.util.*;

public class Min_Cost {
    
    public static int minCostClimbStairs(int[] cost){
        
        int n = cost.length;
//        
//        int[] dp = new int[n + 1];
//        dp[0] = 0;
//        dp[1] = 0;
//        
//        for(int i = 2; i <= n; i++){  
//            dp[i] = Math.min(dp[i - 1] + cost[i - 1],dp[i-2] + cost[i - 2]);
//        }
//        
//        return dp[n];

        
        int prev2 = 0; // dp[0]
        int prev1 = 0; // dp[1]

        for (int i = 2; i <= n; i++) {

            int curr = Math.min(
                prev1 + cost[i - 1],
                prev2 + cost[i - 2]
            );

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}



// dp[i] = minimum total cost required to reach position i