//Задача

// Необходимо реализовать следующий метод:

// 1. Получаем на входе массив чисел.

// 2. Все четные числа увеличиваем на единицу.

// 3. Возвращаем кусок списка с 3-го по 7-й элемент.


import java.util.Arrays;

public class Main {

    public static void customList(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 2; i < 6; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        int[] array = {13, 45, 75, 357, 74, 85, 22, 77, 85, 36, 37, 22,};
        customList(array);
        int[] arrayCopy = Arrays.copyOfRange(array, 2, 6);
        System.out.println(Arrays.toString(arrayCopy));
    }
}