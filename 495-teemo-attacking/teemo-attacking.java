class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
         int total = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] - timeSeries[i] >= duration) {
                total += duration;
            } 
            else {
                total += timeSeries[i + 1] - timeSeries[i];
            }
        }

        if (timeSeries.length > 0) {
            total += duration;
        }

        return total;
    }
}