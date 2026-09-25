class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int sum=0;
      int maxsum=Integer.MIN_VALUE;
      int minsum=Integer.MAX_VALUE;
      int c_max=0;
      int c_min=0;
      for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        c_max=Math.max(nums[i],c_max+nums[i]);
        maxsum=Math.max(maxsum,c_max);
        c_min=Math.min(nums[i],c_min+nums[i]);
        minsum=Math.min(minsum,c_min);

      }
      if(maxsum<0){
        return maxsum;
      }
      return Math.max(maxsum, sum-minsum);
    }
}