class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<aliceSizes.length;i++){
            sum1+=aliceSizes[i];
        }
         for(int i=0;i<bobSizes.length;i++){
            sum2+=bobSizes[i];
        }
        int diff= (sum1-sum2)/2;

        Arrays.sort(bobSizes);
            for(int x:aliceSizes){
                int target=x-diff;
                int low=0;
                int high=bobSizes.length-1;

                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(bobSizes[mid]==target){
                        return new int[]{x,target};
                    }
                    else if(bobSizes[mid]<target){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
            }
            return new int[0];
       
        
    }
}