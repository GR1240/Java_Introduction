// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, 
// реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        if (a.length <= 1) {
            return a;
        }
        
        int middle = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, middle);
        int[] right = Arrays.copyOfRange(a, middle, a.length);
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        return merge(left, right);
    }
    
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, resultIndex = 0;
        
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }
        
        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }
        
        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        int[] sortedArray = mergeSort(a);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));
    }
}


