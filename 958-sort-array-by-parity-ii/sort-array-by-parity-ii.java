class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] even=new int[nums.length/2];
        int[] odd= new int[nums.length/2];
        int k=0;
        int l=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even[k]=nums[i];
                k++;
            }
            else{
                odd[l]=nums[i];
                l++;
            }
        }
        int m=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=even[m];
           
            i++;
            arr[i]=odd[m];
            m++;
        }
        return arr;
    }
}