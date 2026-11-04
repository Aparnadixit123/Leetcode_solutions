class Solution {
    public List<List<Integer>> permute(int[] nums) {
List<List<Integer>> ans=  new ArrayList<>();
List<Integer> temp= new ArrayList<>();
permutation(0,nums,temp,ans);
return ans;
    }
    public static void permutation(int idx, int[] nums, List<Integer> temp, List<List<Integer>> ans){
       
        if(idx==nums.length){ 
            for(int num:nums){
            temp.add(num);
        }
            ans.add(new ArrayList<>(temp));
            temp.clear();
            return;
        }
        for(int i=idx;i<nums.length;i++){
            int t=nums[idx];
            nums[idx]= nums[i];
            nums[i]=t;
             permutation(idx+1,nums,temp,ans);
          t=nums[idx];
            nums[idx]= nums[i];
            nums[i]=t;
        }
      
    }
}