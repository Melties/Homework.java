/*Задание 1
Есть некоторый массив, состоящий из целых чисел "int[] array", есть некоторое
число "n". Необходимо посчитать сумму всех элементов массива, однако если в
массиве встречается число "n" то в сумму его включать не нужно.*/
public class Task1 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 43, 2, 4, 6, 4, 56, 6, 9, 32};
        int n = 4;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != n){
                sum += array[i];
            }
        }
        System.out.println("Сумма без n = " + sum);
    }
}
