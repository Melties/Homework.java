/*Необходимо найти сумму всех четных чисел в последовательности Фибоначи, до
определенного индекса "n".
Например: Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21        n = 7
    Сумма всех четных до 7го.  равна 2 + 8 = 10.*/
public class Task2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584};
        int n = 14, sum = 0;
        for(int i = 0; i <= n; i++){
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        System.out.println("Сумма всех четных чисел до индекса n = " + sum);
    }
}
