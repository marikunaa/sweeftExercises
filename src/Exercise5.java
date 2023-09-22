public class Exercise5 {


        public static int countVariants(int stairsCount) {
            if (stairsCount <= 1) {
                return 1; //only one way to climb 0 or 1 stair.
            }

            int[] dp = new int[stairsCount + 1];
            dp[0] = 1; // one way to start at 0 stairs (base case).
            dp[1] = 1; // one way to start at 1 stair (base case).

            for (int i = 2; i <= stairsCount; i++) {
                // in order to reach the i-th step, you can either take one step from (i-1)-th step
                // or take two steps from (i-2)-th step. So, the total number of ways
                // to reach the i-th step is the sum of ways to reach (i-1)-th step and (i-2)-th step.
                dp[i] = dp[i - 1] + dp[i - 2];
            }

            return dp[stairsCount];
        }



}
