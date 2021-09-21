package priya;

public class Rotate_matrix {


  public int[][] rotate(int[][] matrix) {
   
     int m = matrix.length;
     //int n = matrix[0].length;
     //int[][] result = new int[n][m];
    // int[][] temp = new int[m][n];
     
     for(int i=0;i<m;i++){
       for(int j=i;j<m;j++){
         int temp=matrix[i][j];
         matrix[i][j]=matrix[j][i];
         matrix[j][i]=temp;
       }
     }

     for(int i=0;i<m;i++)
      {
        int low = 0;
        int high = m-1;
        
        while(low < high)
        {
            int temp = matrix[i][low];
            matrix[i][low] = matrix[i][high];
            matrix[i][high] = temp;
            
            low++;
            high--;
        }
      }
    return matrix;
}

}
