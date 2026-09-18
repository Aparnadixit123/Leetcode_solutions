class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int freq1[]=new int[26];
        
      List<String> str= new ArrayList<>();
        for(int i=0;i<words2.length;i++){
            int temp[]=new int[26];
            for(int j=0;j<words2[i].length();j++){
                temp[words2[i].charAt(j)-'a']++;
            }
            for(int j=0;j<26;j++){
                freq1[j]=Math.max(freq1[j],temp[j]);
            }
        }
        for(int i=0;i<words1.length;i++){
            int freq2[]=new int[26];
            for(int j=0;j<words1[i].length();j++){
freq2[words1[i].charAt(j)-'a']++;
            }
            int flag=0;
            for(int j=0;j<26;j++){
                if(freq1[j]!=0){
                    if(freq1[j]>freq2[j]){
flag=1;
break;
                    }
                    
                }
               
                    
            }
            if(flag==0){
                       str.add(words1[i]);
                    }
        }
        return str;
    }
}