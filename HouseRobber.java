
 // 75 35 198 1572 1250

 public class HouseRobber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int maxAmount = rob(nums);
        System.out.println("Total amount you can rob: " + maxAmount);
    }

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[n - 1];
    }
}
