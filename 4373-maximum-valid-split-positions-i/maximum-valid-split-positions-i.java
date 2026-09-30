class Solution {
    public int maxValidSplits(int[] nums) {

        int n = nums.length;
        int ans = 0;
        for (int remove = -1; remove < n; remove++) {

            int m = (remove == -1) ? n : n - 1;

            if (m < 2) {
                continue;
            }

            int[] arr = new int[m];

            int idx = 0;

            for (int i = 0; i < n; i++) {
                if (i != remove) {
                    arr[idx++] = nums[i];
                }
            }
            int[] prefix = new int[m];
            prefix[0] = arr[0];

            for (int i = 1; i < m; i++) {
                prefix[i] = gcd(prefix[i - 1], arr[i]);
            }
            int[] suffix = new int[m];
            suffix[m - 1] = arr[m - 1];

            for (int i = m - 2; i >= 0; i--) {
                suffix[i] = gcd(suffix[i + 1], arr[i]);
            }


            int count = 0;

            for (int i = 0; i < m - 1; i++) {

                if (prefix[i] == suffix[i + 1]) {
                    count++;
                }
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }

    public int gcd(int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}