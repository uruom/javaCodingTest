package Q1_07_Rotate_Matrix;

import CtCILibrary.AssortedMethods;

/**
 * @ClassName:MyCodeQ107
 * @Auther: uruom
 * @Description: Q107
 * @Date: 2022/12/20 10:09
 * @Version: v1.0
 */
public class MyCodeQ107 {
    public static void rotate(int[][] matrix){
        int n = matrix.length;
        if(n==0) return;
        if(n!=matrix[0].length) return;
        for(int i=n/2;i>0;i--){
            int row = i-1;
            int total = n - row*2-1;
            for(int j=0;j<total;j++){
                int temp = matrix[row][row+j];
                matrix[row][row+j] = matrix[total+row-j][row];//left->top
                matrix[total+row-j][row] = matrix[total+row][row+total-j];
                matrix[row+total][row+total-j] = matrix[row+j][row+total];
                matrix[row+j][row+total]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = AssortedMethods.randomMatrix(5, 5, 0, 24);
        AssortedMethods.printMatrix(matrix);
        rotate(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }
}
