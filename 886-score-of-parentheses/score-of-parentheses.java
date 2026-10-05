class Solution {
    public int scoreOfParentheses(String s) {
        int open=0;
        int score=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                
            
            if(i>0&&s.charAt(i-1)=='('){
score+=1<<(open-1);
            }
            open--;}
        }
       
        return score;
    }
}