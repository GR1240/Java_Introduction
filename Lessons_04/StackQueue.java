// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

package Lessons_04;

import java.util.*;

public class StackQueue {
    public static void main(String[] args) {
        int[] array = { 10, 55, 33, 5, 9 };
        Stack<Integer> stack = fillPrintStack(array);
        printStack(stack);
        System.out.println();
        Queue<Integer> queue = fillPrintQueue(array);
        printQueue(queue);

    }

    private static void printQueue(Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }

    private static void printStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static Stack<Integer> fillPrintStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int elem : array) {
            stack.push(elem);
        }
        return stack;
    }

    public static Queue<Integer> fillPrintQueue(int[] array) {
        Queue<Integer> queue = new LinkedList<>();
        for (int elem : array) {
            queue.add(elem);
        }
        return queue;
    }
}
