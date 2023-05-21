/*Дан некоторый двумерный массив "int[][] matrix". Нужно определить каких чисел
в нем больше, положительных или отрицательных. */
public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, -2, 3},
                {0, -5, -6},
                {-7, -8, 9}
        };
        int plus = 0;
        int minus = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    plus++;
                } else if (matrix[i][j] < 0) {
                    minus++;
                }
            }
        }
        if (plus > minus){
            System.out.print("Положительных чисел больше чем отрицательных");
        } else if (plus < minus){
            System.out.print("Отрицательных чисел больше чем положительных");
        } else {
            System.out.print("Положительных и отрицательных чисел равное количество");
        }
    }
}
