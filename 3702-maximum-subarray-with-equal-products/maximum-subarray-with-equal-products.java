class Solution {
    public int maxLength(int[] nums) {
        int n= nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            long product=1;
            for(int j=i;j<n;j++){
             product= product*nums[j];
             long gcd=nums[i];
             long lcm= nums[i];

              for (int k = i + 1; k <= j; k++) {
                    gcd = findGCD(gcd, nums[k]);
                    lcm = findLCM(lcm, nums[k]);
                }
                  if (product == gcd * lcm) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
            }
        
    
     public long findGCD(long a, long b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }

    public long findLCM(long a, long b) {
        return (a / findGCD(a, b)) * b;
    }
}