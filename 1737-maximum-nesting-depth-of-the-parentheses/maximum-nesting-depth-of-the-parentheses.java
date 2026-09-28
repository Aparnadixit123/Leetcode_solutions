class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int ans=0;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='('){
            depth++;
            ans=Math.max(ans,depth);
        }
        else if(c==')'){
depth--;
        }
    }
    return ans;
    }
}