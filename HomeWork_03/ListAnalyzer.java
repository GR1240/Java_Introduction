// Реализуйте метод, который принимает на вход целочисленный массив arr:
// - Создаёт список ArrayList, заполненный числами из исходого массива arr.
// - Сортирует список по возрастанию и выводит на экран.
// - Находит минимальное значение в списке и выводит на экран - Minimum is {число} 
// - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}

Integer[] arr - массив целых чисел.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListAnalyzer {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Сортировка списка по возрастанию
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Находим минимум и максимум
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Minimum is " + min);
        System.out.println("Maximum is " + max);

        // Находим среднее арифметическое
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double average = (double) sum / list.size();
        System.out.println("Average is = " + average);
    }

    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        analyzeNumbers(arr);
    }
}
