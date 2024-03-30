// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 500
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class UniqueNums {
    public static void main(String[] args) {
        int[] array = createArray(1000, 25);
        System.out.println(getPercentUniqueElem(array));
    }

    public static int[] createArray(int size, int max) {
        int[] arr = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rnd.nextInt(max);
        }
        return arr;
    }

    public static double getPercentUniqueElem(int[] arr) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : arr) {
            uniqueNums.add(num);
        }
        double res = (double) uniqueNums.size() * 100 / arr.length;
        return res;
    }
}