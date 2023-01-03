package Q1_08_Zero_Matrix;

import CtCILibrary.AssortedMethods;

/**
 * @ClassName:MyCodeQ108
 * @Auther: uruom
 * @Description: Q108
 * @Date: 2022/12/20 10:46
 * @Version: v1.0
 */
public class MyCodeQ108 {

    public static void setZeros(int[][] matrix){
        int n = matrix.length;
        if(n==0) return;
        int m = matrix[0].length;
        if(m==0) return;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<n;k++){
                        if(matrix[k][j]!=0)
                        matrix[k][j]=-20;
                    }
                    for(int k=0;k<m;k++){
                        if(matrix[i][k]!=0)
                        matrix[i][k]=-20;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-20) matrix[i][j]=0;
            }
        }
    }
    public static void main(String[] args) {
        int nrows = 10;
        int ncols = 15;
        int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);

        AssortedMethods.printMatrix(matrix);

        setZeros(matrix);

        System.out.println();

        AssortedMethods.printMatrix(matrix);
    }
}
