class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int idx=0;
        int count=0;
        while(count<g.length && idx<s.length){
            if(s[idx]>=g[count]){
                count++;
            }
            idx++;
        }
        return count;
    }
}