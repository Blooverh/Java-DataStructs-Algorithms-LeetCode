package Blind75;

import java.util.Arrays;

/*
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 */
public class Lt73 {
    public static void main(String[] args) {
        
    }

    //solution is in O(1)
    public void setZeroes(int[][] matrix) {
        int m= matrix.length; //length of the rows
        int n= matrix[0].length; //length of the columns
        int k=0;
        
        //does first row have zero? 
        while(k < n && matrix[0][k] !=0){
            k++;
        }

        //use first row/column as a marker, scan the matrix 
        for(int i=0; i< m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[0][j] =matrix[i][0]=0; 
                }
            }
        }

        //set the zeros
        for(int i=1; i<m; i++){
            for(int j=n-1; j>=0; j--){
                if(matrix[0][j] == 0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //set the zeros for the first row
        if(k<n){
            Arrays.fill(matrix[0], 0);
        }
    }
}
