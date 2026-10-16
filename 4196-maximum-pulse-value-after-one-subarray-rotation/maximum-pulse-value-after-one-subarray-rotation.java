
class Solution {
    public long maxValue(int[] nums) {
        int n = nums.length;

        long total = 0;
        for (int i = 0; i < n; i++) {
            total += (i % 2 == 0) ? (long) nums[i] : -(long) nums[i];
        }

        if (n == 1) return total;

        long ans = Math.max(total,
            total - 2L * ((long) nums[0] - nums[1]));

        long sum = (long) nums[0] - nums[1];
        long maxEven = nums[0];
        long maxOdd = Math.max(0L, sum);

        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
                ans = Math.max(ans, total - 2L * (sum - maxEven));
                maxEven = Math.max(maxEven, sum);
            } else {
                sum -= nums[i];
                ans = Math.max(ans, total - 2L * (sum - maxOdd));
                maxOdd = Math.max(maxOdd, sum);
            }
        }

        return ans;
    }
}
