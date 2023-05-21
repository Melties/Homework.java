/*Даны две квадратные матрицы. Необходимо написать программу которая посчитает их
сумму и разности. */
public class Task6 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {4, 2, 9},
                {1, 9, 2},
                {5, 7, 3}
        };
        int[][] matrixSum;
        matrixSum = new int[3][3];
        int[][] matrixDif;
        matrixDif = new int[3][3];
        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
                matrixDif[i][j] = matrix2[i][j] - matrix1[i][j];
            }
        }
        System.out.println("Сумма матриц: ");
        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrixSum[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("Разность матриц: ");
        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrixDif[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
