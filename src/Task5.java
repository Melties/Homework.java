/*Дан некоторый двумерный массив "int[][] matrix". Нужно определить является ли он нижней
треугольной матрицей или же нет. */
public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 0},
                {4, 5, 0},
                {7, 0, 8}
        };
        if(matrix.length != matrix[0].length) {
            System.out.println("Матрица должна быть квадратной");
        }
        int stop = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length ; j++) {
                if (matrix[i][j] != 0) {
                    stop = 1;
                    break;
                }
            }
        }
        if(stop == 0){
            System.out.println("Массив является нижней треугольной матрицей");
        } else {
            System.out.println("Массив не является нижней треугольной матрицей");
        }
    }
}
