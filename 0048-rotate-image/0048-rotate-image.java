class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        //transpose inplace of square matrix
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Rotate each row
        for(int i=0;i<n;i++){
            reverseMatrix(matrix[i]);
        }
    
    }
    public static void reverseMatrix(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
//Appraoch ->First fid out transpose using swapiing elements bcz in-place condition and square matrix and then we have to reverse each row to get rotate matrix