class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list=new ArrayList<>(); 
       key(list,digits,"");
        return list;
    }
 
   public static void key(ArrayList<String> list,String digits, String ans){
    String[] keys= {"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
   
        if(digits.length()==0){
           list.add(ans);
            return;
        }
        char ch= digits.charAt(0);
        String s= keys[ch-'0'];
        for(int i=0;i<s.length();i++){
            key(list,digits.substring(1), ans+s.charAt(i));
        }

    }

   
}