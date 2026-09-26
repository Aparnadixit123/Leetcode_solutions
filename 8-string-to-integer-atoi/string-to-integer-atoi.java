class Solution {
    public int myAtoi(String s) {
     
       if (s == null || s.isEmpty()) {
            return 0;
        }

        int res = 0, 
        sign = 1, 
        i = 0;

        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i<s.length() && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch<'0'|| ch>'9'){
                break;
            }
            int digit=ch-'0';
            if(res>(Integer.MAX_VALUE-digit)/10){
                if(sign==1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }
            }
            res=res*10+digit;
            i++;
        }
        return res*sign;
      
    }
}