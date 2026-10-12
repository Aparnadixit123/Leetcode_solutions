class Solution {
    public int[] arrayRankTransform(int[] arr) {
     int n = arr.length;
        int[] sorted = arr.clone();
        int[] ranks = new int[n];
        int[] ans = new int[n];

        Arrays.sort(sorted);

        int rank = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0 || sorted[i] != sorted[i - 1]) {
                rank++;
            }
            ranks[i] = rank;
        }

        for (int i = 0; i < n; i++) {
            int low = 0, high = n - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (sorted[mid] == arr[i]) {
                    ans[i] = ranks[mid];
                    break;
                } else if (sorted[mid] < arr[i]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return ans;
        

            }
}