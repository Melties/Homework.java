//Дан некоторый массив "int[] array", необходимо инвертировать его.
public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayEmpty;
        arrayEmpty = new int[10];
        for(int i = 0; i < array.length; i++){
            arrayEmpty[i] = array[i];
        }
        System.out.println("Инвертированный массив:");
        for(int i = 0, j = 1; i < array.length; i++, j++){
            array[i] = arrayEmpty[array.length - j];
            System.out.print(array[i] + ", ");
        }
    }
}
