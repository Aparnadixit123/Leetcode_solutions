class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>> ans= new ArrayList<>();
       List<String> ll= new ArrayList<>();
       partition(s,ll,ans);
       return ans; 
    }
    public static void partition(String s,List<String> ll, List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList(ll));
            return;
        }
        for(int cut=1;cut<=s.length();cut++){
            String str=s.substring(0,cut);
            if(ispalindrome(str)){
                ll.add(str);
                partition(s.substring(cut),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean ispalindrome(String str){
         int i=0;
        int j= str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}