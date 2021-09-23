package priya;

public class Reshape_Matrix {
	//public class Solution {
	    public int[][] matrixReshape(int[][] mat, int r, int c) {
	        int[][] res = new int[r][c];
	        if (mat.length == 0 || r * c != mat.length * mat[0].length)
	            return mat;
	        int rows = 0, cols = 0;
	        for (int i = 0; i < mat.length; i++) {
	            for (int j = 0; j < mat[0].length; j++) {
	                res[rows][cols] = mat[i][j];
	                cols++;
	                if (cols == c) {
	                   rows++;
	                    cols = 0;
	                }
	            }
	        }
	        return res;
	    }
	//}
}
