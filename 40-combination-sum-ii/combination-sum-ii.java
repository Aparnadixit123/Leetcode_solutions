class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> ll= new ArrayList<>();
      Arrays.sort(candidates);
       combination(candidates,target, ll,0, ans);
    return ans;  
    }
    public static void combination(int[] candidates, int target, List<Integer> ll, int idx, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
  if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (target < candidates[i]) {
                break;
            }

                ll.add(candidates[i]);
                    combination(candidates, target-candidates[i],ll,i+1,ans);
                    ll.remove(ll.size()-1);
 
        }
    }
}