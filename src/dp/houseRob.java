package dp;
import java.util.*;

public class houseRob {
    
    public static int rob(int[] nums){
        
        int n = nums.length;
//        int[] dp = new int[n];
//        //base case
//        dp[0] = nums[0];
//        if(n >= 2){
//            dp[1] = Math.max(nums[0],nums[1]);
//        }
//        //build dp
//        for(int i = 2; i < n; i++){
//            int skip = dp[i - 1];
//            int rob = nums[i] + dp[i-2];
//            dp[i] = Math.max(skip, rob);
//        }
//        return dp[n-1];

//optmize space

    int prev2 = nums[0];//dp[i-1]
    int prev1 = Math.max(nums[0], nums[1]);

    for(int i = 2; i < n; i++){
        int curr = Math.max(prev1, prev2 + nums[i]);
        prev2 = prev1;
        prev1 = curr;
    }
    return prev1;
    
    }
}
    
//    at i have 2 choice rob or skip