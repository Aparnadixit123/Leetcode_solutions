class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] s= new String[n];
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=score[i];
    }
    Arrays.sort(arr);
    for(int i=n-1;i>=0;i--){
        for(int j=0;j<n;j++){
            if(arr[i]==score[j]){
                if(i==n-1){
s[j]="Gold Medal";
                }
                else if(i==n-2){
                    s[j]="Silver Medal";
                }
                else if(i==n-3){
                    s[j]="Bronze Medal";
                }
                else{
                    s[j]=String.valueOf(n-i);
                }

            }
        }
    }
    return s;
    }
}