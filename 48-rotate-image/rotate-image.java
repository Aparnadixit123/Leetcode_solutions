class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        for(int i=0;i<n;i++){
           for( int j=i+1;j<m;j++)
{
int temp=matrix[j][i];
matrix[j][i]=matrix[i][j];
matrix[i][j]=temp;
}   
     }
for(int i=0;i<n;i++){
int left=0;
int right=matrix[i].length-1;
while(left<right){
    int temp=matrix[i][right];
matrix[i][right]=matrix[i][left];
matrix[i][left]=temp;
left++;
right--;
}


}
    }
}