class Solution {
    public boolean canAliceWin(int n) {
        int s=10;

boolean alice = true;
while(s<=n){
    n=n-s;
    s--;
    alice= !alice;
}
   return !alice;
    }
}