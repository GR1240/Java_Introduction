// Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). 
// Программа должна работать следующим образом:
// Принимать на вход массив целых чисел для сортировки. 
// Если массив не предоставлен, программа использует массив по умолчанию.
// Сначала выводить исходный массив на экран.
// Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
// Выводить отсортированный массив на экран.
// Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, 
// который выполняет собственно сортировку кучей.
// Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        // Проверяем, предоставлен ли массив через аргументы командной строки
        int[] array;
        if (args.length > 0) {
            array = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        } else {
            // Если аргументы не предоставлены, используем массив по умолчанию
            array = new int[]{5, 8, 12, 3, 6, 9};
        }

        // Выводим исходный массив
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(array));

        // Сортируем массив с помощью сортировки кучей
        heapSort(array);

        // Выводим отсортированный массив
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }

    // Метод для построения кучи
    public static void buildHeap(int[] array) {
        int n = array.length;

        // Проходим по массиву с конца и применяем siftDown для каждого элемента
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(array, i, n);
        }
    }

    // Метод для сортировки кучей
    public static void heapSort(int[] array) {
        int n = array.length;

        // Строим кучу
        buildHeap(array);

        // Постепенно извлекаем максимальный элемент и уменьшаем размер кучи
        for (int i = n - 1; i >= 0; i--) {
            // Обменяем первый элемент (максимальный) с последним
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Перестраиваем кучу для оставшейся части массива
            siftDown(array, 0, i);
        }
    }

    // Метод для перестройки кучи при сортировке
    public static void siftDown(int[] array, int i, int n) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Сравниваем с левым потомком
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // Сравниваем с правым потомком
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // Если максимальный элемент не корень
        if (largest != i) {
            // Меняем местами с корнем
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Продолжаем перестраивать кучу вниз
            siftDown(array, largest, n);
        }
    }
}
